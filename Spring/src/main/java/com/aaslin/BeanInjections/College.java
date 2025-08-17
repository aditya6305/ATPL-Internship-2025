package com.aaslin.BeanInjections;

public class College {
	public Student student;
	private String collegeName;
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public College(Student student) {
		this.student = student;
	}
	
	public String toString() {
		return student+", college name:"+collegeName+"\n";
	}

}
