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
	public long save(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional // TODO -- explore internals
	public List<Book> list() {
		return bookDAO.list();
	}

	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}


}