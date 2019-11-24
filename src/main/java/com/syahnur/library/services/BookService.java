package com.syahnur.library.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.syahnur.library.models.Book;

@Service
public class BookService {

	private ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(
			new Book("Rich Dad, Poor Dad", "Robert Kiyosaki", "12345", "finance"),
			new Book("How to Java", "Java Boy", "12345", "finance"),
			new Book("Laravel From Scratch", "Taylor Otwell", "12345", "finance"),
			new Book("Diary of Wimpy Kid", "Wimpy Kid", "12345", "finance")
		));
	
	public ArrayList<Book> getAll() {
		return this.books;
	}
	
	public Book get(int id) {
		if (id > 0) {
			id--;
		}
		return this.books.get(id);
	}
	
	public void add(Book book) {
		this.books.add(book);
	}
	
	public void delete(int id) {
		if(id >= 0) {
			this.books.remove(id);
		} else if (id < 0) {
			this.pop();
		}
	}
	
	public void update(int id, Book book) {
		Book myBook = this.books.get(id);
		myBook.setName(book.getName());
		myBook.setAuthor(book.getAuthor());
		myBook.setIsbn(book.getIsbn());
		myBook.setGenre(book.getGenre());
	}
	
	private void pop() {
		this.books.remove(this.books.size() - 1);
	}
}
