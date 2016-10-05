package kr.spring.board.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.board.domain.BoardCommand;
import kr.spring.board.service.BoardService;
import kr.spring.util.PagingUtil;

@Controller
public class BoardListController {
	
	//rowCount : 한 페이지의  게시물의 수
	private int rowCount = 10;
	//pageCount : 한 화면에 보여줄 페이지 수
	private int pageCount = 10;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Resource
	private BoardService boardService;
	
	@RequestMapping(value="/board/boardList.do", method=RequestMethod.GET)
	public ModelAndView form(@RequestParam(value="pageNum", defaultValue="1") int currentPage,
					   		 @RequestParam(value="keyfield", defaultValue="") String keyfield,
					   		 @RequestParam(value="keyword", defaultValue="") String keyword) {
		
		
		if(log.isDebugEnabled()) {
			log.debug("currentPage : " + currentPage);
			log.debug("keyfield : " + keyfield);
			log.debug("keyword : " + keyword);
		}
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("keyfield", keyfield);
		map.put("keyword", keyword);
		
		//총 글의 갯수 또는 검색된 글의 갯수
		int count = boardService.getRowCount(map);
		
		PagingUtil page = new PagingUtil(keyfield, keyword, currentPage, count, rowCount, pageCount, "boardList.do");
		
		map.put("start", page.getStartCount());
		map.put("end", page.getEndCount());
		
		List<BoardCommand> list = null;
		if(count > 0) {
			list = boardService.list(map);
		}else{
			list = Collections.emptyList();
		}
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("boardList");
		mav.addObject("count", count);
		mav.addObject("list", list);
		mav.addObject("pagingHtml", page.getPagingHtml());

		return mav;
	}

}
