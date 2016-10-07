package kr.spring.board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.board.dao.BoardMapper;
import kr.spring.board.domain.BoardCommand;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Resource
	private BoardMapper boardMapper;

	@Override
	public BoardCommand selectBoard(int seq) {
		return boardMapper.selectBoard(seq);
	}

	@Override
	public void insertBoard(BoardCommand board) {
		boardMapper.insertBoard(board);
	}

	@Override
	public List<BoardCommand> list(Map<String, Object> map) {
		return boardMapper.list(map);
	}

	@Override
	public int getRowCount(Map<String, Object> map) {
		return boardMapper.getRowCount(map);
	}

}
