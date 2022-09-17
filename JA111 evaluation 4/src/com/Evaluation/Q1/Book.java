package com.Evaluation.Q1;

import java.util.Objects;

public class Book {

	private int bookId;
	private String bookName;
	private String author;
	
	public Book()
	{
		
	}
	
	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book {bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash( bookId);
	}

	@Override
	public boolean equals(Object obj) {
		Book s1= this;
		Book s2=  (Book)obj;
		
	if(s1.getBookId() == s2.getBookId()  )
		return true;
	else
		return false;

	}
	
	
	
}
