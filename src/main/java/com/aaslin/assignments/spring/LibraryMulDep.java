package com.aaslin.assignments.spring;

public class LibraryMulDep {

		private String bookName;
	
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public void showLibrary() {
			System.out.println("Library section: "+bookName);
		}
}
