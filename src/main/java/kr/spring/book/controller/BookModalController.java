package kr.spring.book.controller;

import java.sql.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
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
import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;

@Controller

public class BookModalController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BookService bookService;
	@Resource
	private MemberService memberService;
	@Resource
	private ShopService shopService;
	
		@RequestMapping(value="/shop/bookModal.do", method=RequestMethod.GET)
		public ModelAndView form(HttpSession session,@RequestParam("book_time") String book_time,
													 @RequestParam("book_date") Date book_date,
													 @RequestParam("code") int code){
			
			String id = (String)session.getAttribute("userId");
			
			System.out.println("book_time : " + book_time);
			
			BookCommand bookCommand = new BookCommand();
			
			//로그인시 id, name, phone 유지
			MemberCommand member = new MemberCommand();	
			member = memberService.select(id);
			bookCommand.setId(member.getId());
			bookCommand.setName(member.getName());
			bookCommand.setPhone(member.getPhone());
			
			bookCommand.setCode(code);
			bookCommand.setBook_date(book_date);
			bookCommand.setBook_time(book_time);
			
			ShopCommand shop = new ShopCommand();
			shop = shopService.select(code);
			
			
			//샵에 자리수(max)를 불러와서 로그인한 유저가 자리를 선택시 삭제하는 과정
			int maxtable = bookService.shopTable(code);					
			System.out.println("maxtable : " + maxtable);
			System.out.println("계산값 : " + (maxtable - bookService.selectTime(bookCommand)));
			if(log.isDebugEnabled()){
				log.debug("bookCommand : " + bookCommand); 
			}		
			int remainSeat1 = 0;
			int remainSeat2 = 0;
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
			
			String main_picture = shop.getMain_picture();
			ModelAndView mav1 = new ModelAndView();
			System.out.println("main : " + shop.getMain_picture());
			mav1.setViewName("bookModal");
			mav1.addObject("bookCommand",bookCommand);
			mav1.addObject("remainSeat1", remainSeat1);
			mav1.addObject("remainSeat2", remainSeat2);	
			mav1.addObject("shop", shop);
			mav1.addObject("code", code);
			mav1.addObject("main_picture", main_picture);
			return mav1;
					
		}
		
		@RequestMapping(value="/shop/bookModal.do", method=RequestMethod.POST)
		public ModelAndView submit(@ModelAttribute("bookCommand")@Valid BookCommand bookCommand,
																 @RequestParam("code") int code,
																 @RequestParam("book_time") String book_time,
																  @RequestParam("book_date") Date book_date,
																 BindingResult result){
			
			int maxtable = bookService.shopTable(code);	
			
			bookCommand.setCode(code);
			bookCommand.setBook_date(book_date);
			bookCommand.setBook_time(book_time);
			
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
			mav.addObject("book_time", book_time);
			
			//유효성 체크
			if(result.hasErrors()){				
				return mav;				
			}	
			bookService.insert(bookCommand);	
				
			return mav;	
			
	}
		
}
