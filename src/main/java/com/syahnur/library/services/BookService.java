package com.syahnur.library.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syahnur.library.models.Book;
import com.syahnur.library.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Iterable<Book> getAll() {
		return this.bookRepository.findAll();
	}
	
	public Book get(int id) {
		return this.bookRepository.findById(id).get();
	}
	
	public void add(Book book) {
		this.bookRepository.save(book);
	}
	
	public void delete(int id) {
		this.bookRepository.deleteById(id);
	}
	
	public void update(int id, Book book) {
		this.bookRepository.save(book);
	}
	
}
