package com.aaslin.assignments.spring;

public class Faculty {
	private Course course;
	public Faculty(Course course) {
		this.course = course;
	}
	public void showCourse() {
		System.out.print("Faculty is teaching ");
		course.displayCourse();
	}
}
