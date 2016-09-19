package kr.spring.book.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.book.dao.BookMapper;
import kr.spring.book.domain.BookCommand;
import kr.spring.shop.dao.ShopMapper;
import kr.spring.shop.domain.ShopCommand;

@Service
public class BookServiceImpl implements BookService{

	@Resource
	private BookMapper bookMapper;
	@Resource
	private ShopMapper shopMapper;
	
	@Override
	public void insert(BookCommand book) {
		bookMapper.insert(book);
	}

	@Override
	public void updateCode(Integer code) {
		bookMapper.updateCode(code);
	}	

	@Override
	public void delete(String id) {
		bookMapper.delete(id);
	}



	@Override
	public BookCommand selectBook(String id) {
		return bookMapper.selectBook(id);
	}

	@Override
	public List<BookCommand> selectShop(Integer code) {
		return bookMapper.selectShop(code);
	}	

	@Override
	public ShopCommand selectTable(Integer code) {
		return bookMapper.selectTable(code);
	}

	@Override
	public BookCommand selectTime(Integer seat) {
		return bookMapper.selectTime(seat);
	}


}
