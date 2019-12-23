package com.thanhhnguyen23.spring.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.thanhhnguyen23.spring.model.Book;

@Component
public interface BookDAO {

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
