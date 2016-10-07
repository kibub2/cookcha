package kr.spring.admin.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	private Logger log = Logger.getLogger(this.getClass());
	@RequestMapping("/admin.do")
	public String process(){
		
		return "admin";
	}

}
