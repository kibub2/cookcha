package kr.spring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchShopController {
	
	@RequestMapping("/member/searchShop.do")
	public String form(){
		return "searchShop";
	}
}
