package kr.spring.book.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.book.domain.BookCommand;

@Repository
public interface BookMapper {
	
	@Insert("INSERT INTO book (seq, id, name, book_date, book_time, phone, seat) VALUES (book_seq.nextval, #{id}, #{name}, #{book-date}, #{book-time}, #{name}, #{seat})")
	public void insert(BookCommand book);
	
	@Select("SELECT * FROM book WHERE id = #{id}")
	public BookCommand selectBook(String id);
}
