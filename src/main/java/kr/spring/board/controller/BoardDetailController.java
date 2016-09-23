package kr.spring.board.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.board.domain.BoardCommand;
import kr.spring.board.service.BoardService;

@Controller
public class BoardDetailController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private BoardService boardService;
	
	@RequestMapping(value="/board/boardDetail.do", method=RequestMethod.GET)
	public ModelAndView process(@RequestParam("seq") int seq) {
		
		if(log.isDebugEnabled()){
			log.debug("seq : " + seq);
		}
		
		BoardCommand board = boardService.selectBoard(seq);

		return new ModelAndView("boardDetail", "board", board);
	}

}
