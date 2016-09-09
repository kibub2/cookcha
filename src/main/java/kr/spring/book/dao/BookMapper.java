package kr.spring.book.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.book.domain.BookCommand;

@Repository
public interface BookMapper {
	
	@Insert("INSERT INTO book (seq, id, name, book_date, book_time, code, phone, seat, content) VALUES (book_seq.nextval, #{id}, #{name}, #{book_date}, #{book_time, jdbcType=VARCHAR}, 1, #{name}, #{seat}, #{content, jdbcType=VARCHAR})")
	public void insert(BookCommand book); 
	
	@Select("SELECT * FROM book WHERE id = #{id}")
	public BookCommand selectBook(String id);
	/*
	@Update("UPDATE book SET id=#{id}, name=#{name}, book_date=#{book_date}, book_time=#{book_time, jdbcType=VARCHAR}, code=#{code}, phone=#{phone}, seat=#{seat}, content=#{content} WHERE seq=#{seq}")
	public void update(BookCommand book);
	*/
	@Delete("DELETE FROM book WHERE id=#{id}")
	public void delete(String id);
	
	/*@Update("UPDATE book SET seat = seat-1 WHERE code = #{code}")*/
	public void updateCode(Integer code);
}
