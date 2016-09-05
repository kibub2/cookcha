package kr.spring.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouletController {
		
		@RequestMapping("/event/roulet.do")
		public String process(){
			return "roulet";
		}
		
		
		}
		
		
	
