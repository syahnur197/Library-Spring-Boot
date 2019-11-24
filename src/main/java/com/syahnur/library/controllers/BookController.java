package com.syahnur.library.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.syahnur.library.models.Book;
import com.syahnur.library.services.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("")
	public ArrayList<Book> index() {
		return this.bookService.getAll();
		
	}
	
	@GetMapping("/{id}")
	public Book show(@PathVariable int id) {
		return this.bookService.get(id);
	}
	
	@PostMapping("")
	public ArrayList<Book> store(@RequestBody Book book) {
		this.bookService.add(book);
		return this.bookService.getAll();
	}
	
	@DeleteMapping("/{id}")
	public ArrayList<Book> delete(@PathVariable int id) {
		this.bookService.delete(id);
		return this.bookService.getAll();
	}
	
	@PutMapping("/{id}")
	public ArrayList<Book> update(@PathVariable int id, @RequestBody Book book) {
		this.bookService.update(id, book);
		return this.bookService.getAll();
	}
	
	

}
