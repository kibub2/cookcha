package kr.spring.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

	@RequestMapping("/blog/main.do")
	public String form(){
		return "blogMain";
	}
}
