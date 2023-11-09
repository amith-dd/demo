package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.ResponseStructure;
import com.example.demo.dto.Book;
import com.example.demo.service.BookService;



@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService service;
	
	@PostMapping
	public ResponseStructure<Book> saveBook(@RequestBody Book b) {
		return service.saveBook(b);
	}
	
	@GetMapping
	public Book findBook(@RequestParam int id) {
		return service.findBook(id);
	}
	
	@GetMapping("/all")
	public List<Book> findAll(){
		return service.findAll();
	}
	@DeleteMapping
	public Book deleteBook(@RequestParam int id) {
		return service.deleteBook(id);
	}
	@PutMapping
	public Book updateBook(@RequestBody Book b,@RequestParam int id) {
		return service.updateBook(b, id);
	}
	

	
	
	
	
	
}
