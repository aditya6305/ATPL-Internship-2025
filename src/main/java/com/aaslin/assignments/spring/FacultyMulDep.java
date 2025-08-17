package com.aaslin.assignments.spring;

public class FacultyMulDep {
	private String name;
	
	public FacultyMulDep(String name) {
	
		this.name = name;
	}

	public void showFaculty() {
		System.out.println("FacultyName is:"+name);
	}
}
