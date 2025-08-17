package com.aaslin.assignments.spring;

public class Course {
	private String courseName;
	// Constructor
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void displayCourse() {
		System.out.println("course: "+courseName);
	}
	
	
}
