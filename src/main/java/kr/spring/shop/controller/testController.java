package kr.spring.shop.controller;



import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;

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
	
	@Resource
	private ShopService shopService;
	
	@RequestMapping("/shop/test.do")
	public ModelAndView process(){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		List<ShopCommand> shop = null;
		shop = shopService.list(map);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopTest");
		mav.addObject("shop", shop);
		
		return mav; 
	}
}
