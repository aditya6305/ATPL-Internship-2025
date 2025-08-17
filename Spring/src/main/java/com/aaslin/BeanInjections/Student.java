package com.aaslin.BeanInjections;

public class Student {
	public int id;	
	public String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
		public String toString() {
			return "Constructor Injection:\n id: "+id+", name: "+name;
		}

}
