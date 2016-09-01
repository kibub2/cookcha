package kr.spring.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopRegisterController {
	
	@RequestMapping("/admin/shopRegister.do")
	public String form(){
		
		
		return "shopRegister";
	}
}
