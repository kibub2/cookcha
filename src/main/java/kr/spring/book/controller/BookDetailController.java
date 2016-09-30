package kr.spring.book.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.spring.book.Service.BookService;
import kr.spring.book.domain.BookCommand;
import kr.spring.member.domain.MemberCommand;
import kr.spring.member.service.MemberService;

@Controller
public class BookDetailController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BookService bookService;
	@Resource
	private MemberService memberService;
	
	@RequestMapping("/shop/bookDetail.do")
	public String form(HttpSession session, @RequestParam("code") int code){
		String id = (String) session.getAttribute("userId");
		
		BookCommand bookCommand = new BookCommand();
		bookCommand.setCode(code);
		MemberCommand member = new MemberCommand();
		member = memberService.select(id);
		bookCommand.setId(member.getId());
		bookCommand.setName(member.getName());
		bookCommand.setPhone(member.getPhone());
		
		return "bookModal";
	}
}
