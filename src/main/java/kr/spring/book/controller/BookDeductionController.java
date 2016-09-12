package kr.spring.book.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.spring.book.Service.BookService;
import kr.spring.book.domain.BookCommand;


@Controller
public class BookDeductionController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BookService bookService;
	
	@RequestMapping("/bookDeduction.do")
	@ResponseBody
	public Map<String, String> process(BookCommand bookCommand,
									   HttpSession session, Integer code){
		
		if(log.isDebugEnabled()){
			log.debug("bookCommand : " + bookCommand);
		}
		
		Map<String, String> map = new HashMap<String, String>();
		
		try{
			String userId = (String)session.getAttribute("userId");
			if(userId == null){ //로그인 안됨
				map.put("result", "logout");
			}else{ //로그인 됨
				//예약 막기
				bookService.updateCode(code);
				map.put("result", "success");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			map.put("result", "failure");
		}
		
		return map;
	}
		
}
