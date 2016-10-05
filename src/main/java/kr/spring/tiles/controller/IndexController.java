package kr.spring.tiles.controller;

import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.rate.domain.RateCommand;
import kr.spring.rate.service.RateService;
import kr.spring.recommend.service.RecommendService;
import kr.spring.shop.domain.ShopCommand;

@Controller
public class IndexController {
	
	private Logger log=Logger.getLogger(this.getClass());
	
	@Resource
	private RecommendService recommendService;
	
	@Resource
	private RateService rateService;
	
	
	@RequestMapping("/index.do")
	public ModelAndView process(HttpSession session){
		//날짜 구하기
		Calendar cal=Calendar.getInstance();
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		if(dayOfWeek==2){
			cal.add(Calendar.DATE, -1);
		}else if(dayOfWeek==3){
			cal.add(Calendar.DATE, -2);
		}else if(dayOfWeek==4){
			cal.add(Calendar.DATE, -3);
		}else if(dayOfWeek==5){
			cal.add(Calendar.DATE, -4);
		}else if(dayOfWeek==6){
			cal.add(Calendar.DATE, -5);
		}else if(dayOfWeek==7){
			cal.add(Calendar.DATE, -6);
		}
		Date startDate=cal.getTime();
		cal.add(Calendar.DATE, 6);
		Date endDate=cal.getTime();
		SimpleDateFormat format=new SimpleDateFormat("yy/MM/dd");
		
		//start = 현재 날짜에 해당하는 주의 시작일자 (시작하는 일요일 의 날짜)
		String startDateString=format.format(startDate);
		//end = 현재 날짜에 해당하는 주의 끝나는일자 (끝나는 토요일 의 날짜)
		String endDateString=format.format(endDate);
		
		System.out.println(startDateString+"    "+endDateString);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("startDateString", startDateString);
		map.put("endDateString", endDateString);
		
		int totalCount=recommendService.weeklyShopCount(map);
		
		//가게 리스트 받아오기
		List<ShopCommand> shopList=null;
		if(totalCount>0){
			shopList=recommendService.weeklyShop(map);
		}else{
			shopList=Collections.emptyList();
		}
		
		//현재 사용자가 평가한 가게의 가게 평가정보 불러오기
		String mem_id=(String)session.getAttribute("userId");
		List<RateCommand> ratingList=null;
		ratingList=rateService.ratedShopList(mem_id);
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("count", totalCount);
		mav.addObject("shopList", shopList);
		mav.addObject("ratingList", ratingList);
		return mav;
	}
}
