package kr.spring.rate.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/rate.do")
	public ModelAndView process(@RequestParam(value="pageNum", defaultValue="1")int currentPage){
		
		if(log.isDebugEnabled()){
			log.debug("currentPage : "+currentPage);
		}
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		//ÃÑ °¡°Ô¼ö
		int totalCount=shopService.getTotalCount();
		
		PagingUtil page=new PagingUtil(currentPage, totalCount, rowCount, pageCount, "rate.do");
		map.put("start", page.getStartCount());
		map.put("end", page.getEndCount());
		
		List<ShopCommand> list=null;
		if(totalCount>0){
			list=shopService.shopList(map);
		}else{
			list=Collections.emptyList();
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("rate");
		mav.addObject("count", totalCount);
		mav.addObject("list", list);
		mav.addObject("pagingHtml", page.getPagingHtml());
		return mav;
	}
	
	
	
}
