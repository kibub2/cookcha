package kr.spring.book.Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.book.domain.BookCommand;
import kr.spring.shop.domain.ShopCommand;

@Transactional
public interface BookService {
	
	public void insert(BookCommand book);
	
	public BookCommand selectBook(String id);
	
	public void delete(String id);

	public BookCommand updateCode(int code);
	
	public List<BookCommand> selectShop(int code);
	
	public int selectTime(BookCommand bookCommand);
	
	public int shopTable(int code);
	
	public int selectTime2(BookCommand bookCommand);

}
