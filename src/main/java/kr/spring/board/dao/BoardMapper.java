package kr.spring.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.board.domain.BoardCommand;

@Repository("boardMapper")
public interface BoardMapper {
	
	public List<BoardCommand> list(Map<String, Object> map);
	public List<BoardCommand> list2(Map<String, Object> map);
	public int getRowCount(Map<String, Object> map);
	@Select("SELECT * FROM board WHERE seq=#{seq}")
	public BoardCommand selectBoard(int seq);
	@Select("SELECT * FROM board2 WHERE seq=#{seq}")
	public BoardCommand selectBoard2(int seq);
	@Insert("INSERT INTO board(seq, subject, content, reg_date, id, code) VALUES (board_seq.nextval, #{subject}, #{content}, sysdate, #{id}, #{code})")
	public void insertBoard(BoardCommand board);
	@Insert("INSERT INTO board2(seq, subject, content, reg_date, id, code) VALUES (board_seq.nextval, #{subject}, #{content}, sysdate, #{id}, #{code})")
	public void insertBoard2(BoardCommand board2);
}
