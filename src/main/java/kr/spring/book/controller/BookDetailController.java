package kr.spring.book.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookDetailController {
	private Logger log = Logger.getLogger(this.getClass());

	
	@RequestMapping("/bookDetail.do")
	public String form(){
		return "bookDetail";
	}
}
