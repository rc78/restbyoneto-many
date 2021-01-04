package com.ravi.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.restfulapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
}
