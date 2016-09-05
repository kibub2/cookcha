package kr.spring.book.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.spring.book.Service.BookService;
import kr.spring.book.domain.BookCommand;

@Controller
@SessionAttributes("command")
public class BookUpdateController {
	private Logger log = Logger.getLogger(this.getClass());
	
	private BookService bookService;
	
	@RequestMapping(value="/bookupdate.do", method=RequestMethod.GET)
	public String form(HttpSession session, Model model){
		
		String id = (String)session.getAttribute("userId");
		BookCommand bookCommand = bookService.selectBook(id);
		model.addAttribute("command", bookCommand);
		return "bookDetail";
	}
}
