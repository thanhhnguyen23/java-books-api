package com.thanhhnguyen23.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thanhhnguyen23.spring.model.Book;
import com.thanhhnguyen23.spring.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	// get all the books
	@GetMapping("/api/book")
	public ResponseEntity<List<Book>> list() {
		List<Book> list = bookService.list();
		return ResponseEntity.ok().body(list);
	}

	// save book
	@PostMapping("/api/book") // TODO -- explore internals
	public ResponseEntity<?> save(@RequestBody Book book) {
		long id = bookService.save(book);
		System.out.println("id: " + id);
		return ResponseEntity.ok("Book has been created with id: " + id);

	}

}
