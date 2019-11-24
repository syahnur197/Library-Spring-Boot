package com.syahnur.library.models;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class Book implements Serializable {

	private String name;
	private String author;
	private String isbn;
	private String genre;
	
	public Book(String name, String author, String isbn, String genre) {
		super();
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
	}
	
	
	
}
