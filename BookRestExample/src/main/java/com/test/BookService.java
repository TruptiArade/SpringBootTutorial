package com.test;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {
	
	@Autowired
	private BookRepository bookrepository;
	//private static List<Book> list= new ArrayList<>();
	
	//Add book
	/*static {
		list.add(new Book(4567,"Java","Trupti"));
		list.add(new Book(4568,"C++","Ayesha"));
		list.add(new Book(4569,"Android","Snehal"));
		list.add(new Book(4570,"MySQL","Vinayak"));
		list.add(new Book(4571,"Mongodb","Samindar"));
		
	}*/
	
	//get all book
	public List<Book> getAllBooks()
	{
		
	  List<Book> list=(List<Book>)this.bookrepository.findAll();	
	  return list;	
	}
	
	//get single book by id
	public Book getBookById(int id)
	{
		Book b=null;
	   try {
		
		//b= list.stream().filter(e->e.getId()==id).findFirst().get();
		   
		   b=this.bookrepository.findById(id);
	   }
	   catch(Exception e){
		   e.printStackTrace();
		   
	   }
		return b;
		
	}
	
	
	//Add Book
	public Book AddBook(Book b)
	{
		//list.add(b);
	 Book result=bookrepository.save(b);
		return result;
		
	}
	
	//Delete Book
	public void deleteBook(int bid)
	{
		/*list.stream().filter(bo->{
			if(bo.getId()!=bid)
			{
				return true;
			}
			
			else
			{
				return false;
			}
			
		}).collect(Collectors.toList());
		*/
		
		bookrepository.deleteById(bid);
	}
	
	//Update Book
	
	public void updateBook(Book book, int bookId)
	{
		/*list= list.stream().map(b->{
			
			if(b.getId()==bookId)
			{
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());*/
		
		book.setId(bookId);
		bookrepository.save(book);
	}
	
	
	

}
