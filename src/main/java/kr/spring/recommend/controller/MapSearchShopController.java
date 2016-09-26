package kr.spring.recommend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapSearchShopController {
	
	@RequestMapping("/recommend/map-searchShop.do")
	public String form(){
		return "map-searchShop";
	}
}
