package com.thanhhnguyen23.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
	// get one book
	@GetMapping("/api/book/{id}")
    public ResponseEntity<Book> get(@PathVariable("id") long id){
		Book book = bookService.get(id);
		System.out.println("Book id: " + book + " Book title: " + book.getTitle());
		return ResponseEntity.ok().body(book);
	}

	// update book
	@PutMapping("/api/book/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Book book){
	    bookService.update(id, book);
	    return ResponseEntity.ok().body("Book has been updated");
	}

	// delete book
	@DeleteMapping("/api/book/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id){
	    bookService.delete(id);
	    return ResponseEntity.ok().body("Book has been deleted");
	}

}
