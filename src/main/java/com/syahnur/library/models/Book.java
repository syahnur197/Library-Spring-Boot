package com.syahnur.library.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor 
public class Book implements Serializable {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
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
