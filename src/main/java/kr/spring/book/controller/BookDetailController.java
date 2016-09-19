package kr.spring.book.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;

import kr.spring.book.Service.BookService;
import kr.spring.book.domain.BookCommand;
import kr.spring.member.domain.MemberCommand;
import kr.spring.member.service.MemberService;
import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;

@Controller
public class BookDetailController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BookService bookService;
	@Resource
	private MemberService memberService;
	@Resource
	private ShopService shopService;
		
		@RequestMapping(value="/shop/bookDetail.do", method=RequestMethod.GET)
		public String form(HttpSession session, Model model,
								@RequestParam("code") int code,
								@RequestParam("seat") int seat){
			
			String id = (String)session.getAttribute("userId");
			BookCommand command = new BookCommand();
			MemberCommand member = memberService.select(id);
			command.setId(member.getId());
			command.setName(member.getName());
			command.setPhone(member.getPhone());
			
			//자릿수 줄이기
			bookService.updateCode(code);
			List<BookCommand> book = bookService.selectShop(code);
			
			//
			bookService.selectTable(code);
			ShopCommand command1 = bookService.selectTable(code);
			
			bookService.selectTime(seat);
			BookCommand command2 = bookService.selectTime(seat);
			
								//속성명   속성값  
			model.addAttribute("command", command);
			model.addAttribute("book", book);
			model.addAttribute("command1", command1);
			model.addAttribute("command2", command2);
			
			//타일스네임이랑 동일 뽝
			return "bookDetail";
		}
		
		@RequestMapping(value="/shop/bookDetail.do", method=RequestMethod.POST)
		public String submit(@ModelAttribute("command") @Valid BookCommand bookCommand,
												        BindingResult result){
			if(log.isDebugEnabled()){
				log.debug("bookCommand : " + bookCommand); 
			}			
		
			//유효성 체크
			if(result.hasErrors()){
				//타일스와 동일하게 위치 지정
				return "bookDetail";
			}
			
						
			bookService.insert(bookCommand);
			
			return "redirect:/index.do";
		
	}
			
}
