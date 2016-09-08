package kr.spring.book.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.book.Service.BookService;
import kr.spring.book.domain.BookCommand;

@Controller
public class BookDetailController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BookService bookService;
	
	//커멘드 객체(초기화)
		@ModelAttribute("command")
		public BookCommand initCommand(){
			return new BookCommand();
		}
		
		@RequestMapping(value="/bookDetail.do", method=RequestMethod.GET)
		public String form(){
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
				return form();
			}
						
			bookService.insert(bookCommand);
			
			return "redirect:/bookDetail.do";
	}
			
}
