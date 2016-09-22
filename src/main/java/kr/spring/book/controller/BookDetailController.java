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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.book.Service.BookService;
import kr.spring.book.domain.BookCommand;
import kr.spring.member.domain.MemberCommand;
import kr.spring.member.service.MemberService;
import kr.spring.shop.service.ShopService;

@Controller
@SessionAttributes("bookCommand")
public class BookDetailController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BookService bookService;
	@Resource
	private MemberService memberService;
	@Resource
	private ShopService shopService;
	
		@RequestMapping(value="/shop/bookDetail.do", method=RequestMethod.GET)
		public ModelAndView form(HttpSession session, Model model, @RequestParam("code")int code){
			
			String id = (String)session.getAttribute("userId");
			
			BookCommand bookCommand = new BookCommand();
			
			//로그인시 id, name, phone 유지
			MemberCommand member = new MemberCommand();	
			member = memberService.select(id);
			bookCommand.setId(member.getId());
			bookCommand.setName(member.getName());
			bookCommand.setPhone(member.getPhone());
			
			if(log.isDebugEnabled()){
				log.debug("bookCommand : " + bookCommand); 
			}				
			
			ModelAndView mav1 = new ModelAndView();
			mav1.setViewName("bookDetail");
			mav1.addObject("bookCommand",bookCommand);
			return mav1;
					
		}
		
		@RequestMapping(value="/shop/bookDetail.do", method=RequestMethod.POST)
		public ModelAndView submit(@ModelAttribute("bookCommand")@Valid BookCommand bookCommand,
																 @RequestParam("code") int code,
																 Model model,
																 BindingResult result){

			bookCommand.setCode(code);
			
			//샵에 자리수(max)를 불러와서 로그인한 유저가 자리를 선택시 삭제하는 과정
			int maxtable = bookService.shopTable(code);					
			System.out.println("maxtable : " + maxtable);
			
			int remainSeat1 = 0;
			int remainSeat2 = 0;
			
			System.out.println("계산값 : " + (maxtable - bookService.selectTime(bookCommand)));
			
			//오전시간
			if(maxtable - bookService.selectTime(bookCommand) > 0){
			remainSeat1 = maxtable - bookService.selectTime(bookCommand);
			System.out.println("remainSeat1 : " + remainSeat1);
			}

			//오후시간
			if(maxtable - bookService.selectTime2(bookCommand) > 0){
			remainSeat2 = maxtable - bookService.selectTime2(bookCommand);
			System.out.println("remainSeat2 : " + remainSeat2);
			}
			
			if(log.isDebugEnabled()){
				log.debug("remainSeat1 : " + remainSeat1);
				log.debug("remainSeat2 : " + remainSeat2);
			}
								//속성명 	  속성값  
			//model.addAttribute("bookCommand", bookCommand);
			/*model.addAttribute("book", book);*/
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			mav.addObject("remainSeat1", remainSeat1);
			mav.addObject("remainSeat2", remainSeat2);	
			
			//유효성 체크
			if(result.hasErrors()){				
				return mav;				
			}	
			bookService.insert(bookCommand);	
				
			return mav;	
			
	}
		
}
