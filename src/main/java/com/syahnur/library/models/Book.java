package com.syahnur.library.models;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.time.DateUtils;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

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
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Getter(AccessLevel.NONE)
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
	@Getter(AccessLevel.NONE)
    private Date updatedAt;

	public Book(Integer id, String name, String author, String isbn, String genre, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public Date getCreatedAt() {
		return DateUtils.addHours(this.createdAt, 8);
	}
	
	public Date getUpdatedt() {
		return DateUtils.addHours(this.updatedAt, 8);
	}
	

	
	
	
}
