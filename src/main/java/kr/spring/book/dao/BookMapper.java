package kr.spring.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import kr.spring.book.domain.BookCommand;

@Repository
public interface BookMapper {
	
	@Insert("INSERT INTO book (seq, id, name, book_date, book_time, code, phone, seat, content) VALUES (book_seq.nextval, #{id}, #{name}, #{book_date}, #{book_time, jdbcType=VARCHAR}, #{code}, #{phone}, #{seat}, #{content, jdbcType=VARCHAR})")
	public void insert(BookCommand book); 
	
	@Select("SELECT * FROM book WHERE id = #{id}")
	public BookCommand selectBook(String id);

	@Update("UPDATE book SET id=#{id}, name=#{name}, book_date=#{book_date}, book_time=#{book_time, jdbcType=VARCHAR}, code=#{code}, phone=#{phone}, seat=#{seat}, content=#{content, jdbcType=VARCHAR} WHERE seq=#{seq}")
	public void update(BookCommand book);
	
	@Delete("DELETE FROM book WHERE id=#{id}")
	public void delete(String id);
	
	@Update("UPDATE book SET seat = #{seat} WHERE code = #{code}")
	public BookCommand updateCode(int code);
	
	@Select("SELECT * FROM book WHERE code = #{code}")
	public List<BookCommand> selectShop(int code);
	/*null로 값이 나올 경우 다른 기본값으로 변경하기 위해서는 = nvl  AND book_date=#{book_date}*/
	@Select("SELECT nvl(SUM(seat),0) FROM book WHERE book_time= '점심(12:00~15:00)' AND code=#{code} ")
	public int selectTime(BookCommand bookCommand);
	
	@Select("SELECT nvl(SUM(seat),0) FROM book WHERE book_time= '저녁(18:00~21:00)' AND code=#{code} ")
	public int selectTime2(BookCommand bookCommand);
	
	@Select("SELECT maxtable FROM shop WHERE code = #{code}")
	public int shopTable(int code);

	
}
