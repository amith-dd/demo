package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.config.ResponseStructure;
import com.example.demo.dao.BookDao;
import com.example.demo.dto.Book;

@Service
public class BookService {
	@Autowired
	BookDao dao ;
	
	public ResponseStructure<Book> saveBook(Book b) {
		ResponseStructure<Book> structure = new ResponseStructure<>();
		structure.setData(dao.saveBook(b));
		structure.setMessage("book has been saved");
		structure.setStatus(HttpStatus.CREATED.value());
		return structure;
	}
	
	public Book findBook(int id) {
		return dao.findBook(id);
	}
	public Book deleteBook(int id) {
		return dao.deleteBook(id);
	}
	public List<Book> findAll(){
		return dao.getAllProducts();
	}
	public Book updateBook(Book b, int id) {
		return dao.updateBook(b, id);
	}
	
}
