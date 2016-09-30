package kr.spring.shop.controller;



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

/*
@Controller
public class testController {
	
	@RequestMapping("/shop/test.do")
	public String form(){
		return "shopTest"; 
	}
}
*/

@Controller
public class testController {
	private Logger log = Logger.getLogger(this.getClass());
	
	private int rowCount = 12;
	private int pageCount = 10;
	@Resource
	private ShopService shopService;
	
	@RequestMapping("/shop/test.do")
	public ModelAndView process(@RequestParam(value="pageNum", defaultValue="1")
								int currentPage){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(log.isDebugEnabled()){
			log.debug("currentPage : " + currentPage);
		}
		
		int count = shopService.getRowCount(map);
		PagingUtil page = new PagingUtil("", "", currentPage, count,
				rowCount, pageCount, "test.do");
		
		System.out.println("스타트 : "+page.getStartCount()+" 엔드 : "+page.getEndCount());
		
		map.put("start", page.getStartCount());
		map.put("end", page.getEndCount());
		
		List<ShopCommand> shop = null;
		if(count > 0){
			shop = shopService.shopList(map);
		}else{
			shop = Collections.emptyList();
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopTest");
		mav.addObject("count", count);
		mav.addObject("shop", shop);
		mav.addObject("pagingHtml", page.getPagingHtml());
		
		return mav; 
	}
}
