package kr.spring.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketController {

	@RequestMapping("/event/ticket.do")
	public String process(){
		return "ticket";
	}
}
