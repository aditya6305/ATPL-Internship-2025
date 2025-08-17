package com.aaslin.assignments.spring;

public class University {
	private FacultyMulDep faculty;
	private LibraryMulDep library;
	
	public University(FacultyMulDep faculty) {
		this.faculty = faculty;
	}
	
	public void setLibrary( LibraryMulDep library) {
		this.library = library;
	}
	
	public void show() {
		System.out.println("University has:");
		faculty.showFaculty();
		library.showLibrary();
	}
}
