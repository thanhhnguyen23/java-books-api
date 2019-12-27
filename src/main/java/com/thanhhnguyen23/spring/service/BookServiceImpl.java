package com.thanhhnguyen23.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhhnguyen23.spring.dao.BookDAO;
import com.thanhhnguyen23.spring.model.Book;

@Service // TODO -- explore internals
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookDAO;

	@Override
	@Transactional // TODO -- explore internals
	public long save(Book book) {
		System.out.println("saving book...");
		return bookDAO.save(book);
	}

	@Override
	@Transactional // TODO -- explore internals
	public List<Book> list() {
		return bookDAO.list();
	}

	@Override
	public Book get(long id) {
		System.out.println("getting one single book...");
		return bookDAO.get(id);
	}

	@Override
	@Transactional // TODO -- explore internals
	public void update(long id, Book book) {
	    bookDAO.update(id, book);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
