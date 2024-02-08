package com.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	//@RequestMapping(value="/books",method=RequestMethod.GET)
	
	@Autowired(required=true)
	private BookService bookservice;
	
	//Return all books
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks()
	{
		List<Book> list=bookservice.getAllBooks();
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	//Return Book as per id
	@GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id)
	{
		Book book=bookservice.getBookById(id);
		if(book==null)
		{
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}
	
	// Add Book
	@PostMapping("/books")
	public ResponseEntity<Book> AddBook(@RequestBody Book book)
	{
		Book b=null;
		try
		{
		   b=this.bookservice.AddBook(book);
		   return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	   	
	}
	
	//Delete Book
	@DeleteMapping("/books/{bookid}")
	public ResponseEntity<Void> DeleteBook(@PathVariable("bookid") int bookid)
	{
		try {
	        this.bookservice.deleteBook(bookid);
	       return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//Update Book
	@PutMapping("/books/{bookid}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookid") int bookid)
	{
		try
		{
		   this.bookservice.updateBook(book,bookid);
		     {
		    	 return ResponseEntity.ok().body(book);
		     }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
}
