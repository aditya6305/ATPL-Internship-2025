package com.aaslin.assignments.spring;

public class Library {
	public Book book;
	
	public void setBook(Book book) {
		this.book=book;
	}
	public void showBook() {
		System.out.print("Library contains ");
		book.showBook();
	}
}
