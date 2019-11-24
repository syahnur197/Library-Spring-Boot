package com.syahnur.library.repositories;

import com.syahnur.library.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
