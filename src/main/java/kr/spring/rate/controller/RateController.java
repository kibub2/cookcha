package kr.spring.rate.controller;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.rate.domain.RateCommand;
import kr.spring.rate.service.RateService;
import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;
import kr.spring.util.PagingUtil;

@Controller
public class RateController {
	
	private Logger log=Logger.getLogger(this.getClass());
	private int rowCount=20;
	private int pageCount=10;
	@Resource
	private ShopService shopService;
	@Resource
	private RateService rateService;
	
	@RequestMapping("/rate.do")
	public ModelAndView process(@RequestParam(value="pageNum", defaultValue="1")int currentPage, HttpSession session){
		
		if(log.isDebugEnabled()){
			log.debug("currentPage : "+currentPage);
		}
		
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		//총 가게 수 
		int totalCount=shopService.getTotalCount();
		
		//한페이지에 들아갈 가게수
		PagingUtil page=new PagingUtil(currentPage, totalCount, rowCount, pageCount, "rate.do");
		map.put("start", page.getStartCount());
		map.put("end", page.getEndCount());
		
		//가게 리스트 받아오기
		List<ShopCommand> shopList=null;
		if(totalCount>0){
			shopList=shopService.shopList(map);
		}else{
			shopList=Collections.emptyList();
		}
		
		//현재 사용자가 평가한 가게의 가게 평가정보 불러오기
		String mem_id=(String)session.getAttribute("userId");
		List<RateCommand> ratingList=null;
		ratingList=rateService.ratedShopList(mem_id);
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("rate");
		mav.addObject("count", totalCount);
		mav.addObject("shopList", shopList);
		mav.addObject("ratingList", ratingList);
		mav.addObject("pagingHtml", page.getPagingHtml());
		return mav;
	}
	
	
	
}
