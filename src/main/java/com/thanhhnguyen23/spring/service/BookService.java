package com.thanhhnguyen23.spring.service;

import java.util.List;

import com.thanhhnguyen23.spring.model.Book;

public interface BookService {

	// save record
	long save(Book book);

	// get single record
	Book get(long id);
	
	// get all records
	List<Book> list();
	
	// update the record
	void update(long id, Book book);
	
	
	// delete a record
	void delete(long id);

}
