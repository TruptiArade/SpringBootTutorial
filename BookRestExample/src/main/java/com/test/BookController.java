package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	//@RequestMapping(value="/books",method=RequestMethod.GET)
	
	@Autowired(required=true)
	private BookService bookservice;
	
	//Return all bookss
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		
		return this.bookservice.getAllBooks();
	}
	
	//Return Book as per id
	
	@GetMapping("/books/{id}")
    
	public Book getBook(@PathVariable("id") int id)
	{
		return bookservice.getBookById(id);
	}
	

}