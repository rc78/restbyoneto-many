package com.ravi.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.restfulapi.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{
}
