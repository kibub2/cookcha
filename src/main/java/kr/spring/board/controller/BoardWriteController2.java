package kr.spring.board.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import kr.spring.board.domain.BoardCommand;
import kr.spring.board.service.BoardService;

@Controller
public class BoardWriteController2 {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BoardService boardService;
	
	
	@RequestMapping(value="/board2/boardWrite2.do", method=RequestMethod.GET)
	public String form(HttpSession session, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = (String)session.getAttribute("userId");
		BoardCommand command = new BoardCommand();
		command.setId(id);
		
		model.addAttribute("command", command);
		
		if(id.equals("2@test.com")){
			return "boardWrite2";
		}else{
			return "redirect:/index.do"; 
		}

	}
	
	@RequestMapping(value="/board2/boardWrite2.do", method=RequestMethod.POST)
	public String submit(@ModelAttribute("command") @Valid BoardCommand boardCommand, BindingResult result, SessionStatus status) {
		
		if(log.isDebugEnabled()){
			log.debug("boardCommand : " + boardCommand);
		}
		
		if(result.hasErrors()) {
			return "boardWrite2";
		}
		
		boardService.insertBoard2(boardCommand);
		status.setComplete();
		
		return "redirect:/board2/boardList2.do";
	}
	

}
