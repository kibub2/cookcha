package kr.spring.book.Service;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.book.domain.BookCommand;

@Transactional
public interface BookService {
	
	public void insert(BookCommand book);
	
	public BookCommand selectBook(String id);
	/*
	public void update(BookCommand book);
	*/
	public void delete(String id);

	public void updateCode(Integer code);
}
