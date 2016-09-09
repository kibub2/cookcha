package kr.spring.book.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.book.dao.BookMapper;
import kr.spring.book.domain.BookCommand;

@Service
public class BookServiceImpl implements BookService{

	@Resource
	private BookMapper bookMapper;
	
	@Override
	public void insert(BookCommand book) {
		bookMapper.insert(book);
	}

	@Override
	public void updateCode(Integer code) {
		bookMapper.updateCode(code);
	}

	@Override
	public BookCommand selectBook(String id) {
		return bookMapper.selectBook(id);
	}

	@Override
	public void delete(String id) {
		bookMapper.delete(id);
	}
	

}
