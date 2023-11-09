package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
