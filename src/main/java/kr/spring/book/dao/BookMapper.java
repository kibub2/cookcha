package kr.spring.book.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import kr.spring.book.domain.BookCommand;

@Repository
public interface BookMapper {
	
	@Insert("INSERT INTO book (seq, id, name, book_date, book_time, phone, seat, content) VALUES (book_seq.nextval, #{id}, #{name}, #{book-date}, #{book-time}, #{name}, #{seat}, #{content})")
	public void insert(BookCommand book);
	
	@Select("SELECT * FROM book WHERE id = #{id}")
	public BookCommand selectBook(String id);
	
	@Update("UPDATE book SET id=#{id}, name=#{name}, book_date=#{book_date}, book_time=#{book_time}, phone=#{phone}, seat=#{seat}, content=#{content} WHERE seq=#{seq}")
	public void update(BookCommand book);
	
	@Delete("DELETE FROM book WHERE id=#{id}")
	public void delete(String id);
}
