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
	public BookCommand updateCode(int code) {
		return bookMapper.updateCode(code);
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
	public List<BookCommand> selectShop(int code) {
		return bookMapper.selectShop(code);
	}	

	@Override
	public int selectTime(BookCommand bookCommand) {
		return bookMapper.selectTime(bookCommand);
	}

	@Override
	public int selectTime2(BookCommand bookCommand) {
		return bookMapper.selectTime2(bookCommand);
	}

	@Override
	public int shopTable(int code) {
		return bookMapper.shopTable(code);
	}


}
