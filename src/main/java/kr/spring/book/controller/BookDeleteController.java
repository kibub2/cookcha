package kr.spring.book.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.spring.book.Service.BookService;
import kr.spring.book.domain.BookCommand;

@Controller
@SessionAttributes("command")
public class BookDeleteController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BookService bookService;
	
	@RequestMapping("/delete.do")
	public String submit(@RequestParam("id") String id,
						HttpSession session) throws Exception{
		
		if(log.isDebugEnabled()){
			log.debug("id : " + id);
		}
		
		BookCommand bookCommand = bookService.selectBook(id);
		String userId = (String)session.getAttribute("userId");
		if(!userId.equals(bookCommand.getId())){
			throw new Exception("로그인ID와 다릅니다.");
		}
		
		bookService.delete(id);
		
		
		return "redirect:/index.do";
	}
	
}
