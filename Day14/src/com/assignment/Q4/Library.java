package com.assignment.Q4;

import java.util.ArrayList;
import java.util.List;

public class Library {
   
	List<Book> bookList = new ArrayList<>();
	
	public void addBook(Book book)
	{
		
	}
	
	 public boolean isEmpty()
	 {
		 if(bookList.size()==0)
		  return true;
		 
		 else
			 return false;
	 }
	 
	 public List<Book> viewAllBooks()
	 {
		 return bookList;
	 }
	 
	 public List<Book> viewBooksByAuthor(String author )
	 {
		 return bookList;
	 }
	 
	 public int countNoOfBook(String bookName)
	 {
		 return 0;
	 }
}
