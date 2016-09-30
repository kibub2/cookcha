package kr.spring.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.board.domain.BoardCommand;

@Transactional
public interface BoardService {
	
	public List<BoardCommand> list(Map<String, Object> map);
	public List<BoardCommand> list2(Map<String, Object> map);
	public int getRowCount(Map<String, Object> map);
	public BoardCommand selectBoard(int seq);
	public BoardCommand selectBoard2(int seq);
	public void insertBoard(BoardCommand board);
	public void insertBoard2(BoardCommand board2);

}
