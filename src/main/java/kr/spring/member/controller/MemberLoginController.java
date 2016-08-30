package kr.spring.member.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberLoginController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/member/login.do", method=RequestMethod.GET)
	public String form() {
		return "memberLogin";
	}

}
