package kr.spring.book.Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.book.domain.BookCommand;
import kr.spring.shop.domain.ShopCommand;

@Transactional
public interface BookService {
	
	public void insert(BookCommand book);
	
	public BookCommand selectBook(String id);
	/*
	public void update(BookCommand book);
	*/
	public void delete(String id);

	public void updateCode(Integer code);
	
	public List<BookCommand> selectShop(Integer code);
	
	public BookCommand selectTime(Integer seat);
	
	public ShopCommand selectTable(Integer code);
}
