package com.aaslin.assignments.spring;

public class College {
	private String collegeName;

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void displayCollege() {
		System.out.println("College Name:"+collegeName);
	}
}
