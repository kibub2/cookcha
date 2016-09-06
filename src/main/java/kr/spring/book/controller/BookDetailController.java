package kr.spring.book.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

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
		
		@RequestMapping(value="/bookDetail.do", method=RequestMethod.GET)
		public String form(HttpSession session, Model model){
			
			String id = (String)session.getAttribute("userId");
			BookCommand command = new BookCommand();
			MemberCommand member = memberService.select(id);
			command.setId(member.getId());
			command.setName(member.getName());
			command.setPhone(member.getPhone());
			
		   			    	    //속성명	   속성값
			model.addAttribute("command",command);
			return "bookDetail";
		}
		
		@RequestMapping(value="/bookDetail.do", method=RequestMethod.POST)
		public String submit(@ModelAttribute("command") @Valid BookCommand bookCommand,
												        BindingResult result){
			if(log.isDebugEnabled()){
				log.debug("bookCommand : " + bookCommand); 
			}
			
			//유효성 체크
			if(result.hasErrors()){
				return "bookDetail";
			}
						
			bookService.insert(bookCommand);
			
			return "redirect:/bookDetail.do";
	}
			
}
