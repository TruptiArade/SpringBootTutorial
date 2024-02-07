package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class BookService {
	
	private static List<Book> list= new ArrayList<>();
	
	//Add book
	static {
		list.add(new Book(4567,"Java","Trupti"));
		list.add(new Book(4568,"C++","Ayesha"));
		list.add(new Book(4569,"Android","Snehal"));
		list.add(new Book(4570,"MySQL","Vinayak"));
		list.add(new Book(4571,"Mongodb","Samindar"));
	}
	
	//get all book
	public List<Book> getAllBooks()
	{
	  return list;	
	}
	
	//get single book by id
	public Book getBookById(int id)
	{
		Book b=null;
		b= list.stream().filter(e->e.getId()==id).findFirst().get();
		return b;
		
	}
	
	
	//Add Book
	public Book AddBook(Book b)
	{
		list.add(b);
		return b;
		
	}
	
	//Delete Book
	public void deleteBook(int bid)
	{
		list.stream().filter(bo->{
			if(bo.getId()!=bid)
			{
				return true;
			}
			
			else
			{
				return false;
			}
			
		}).collect(Collectors.toList());
		
	}
	
	
	

}
