package com.aaslin.assignments.spring;

public class Book {
	public String bookTitle;

	

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public void showBook() {
		System.out.println("The book: "+bookTitle);
	}

}
