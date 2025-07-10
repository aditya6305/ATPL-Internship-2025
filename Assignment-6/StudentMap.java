package com.aaslin.java.assignments.assignment6;
import java.util.*;
public class StudentMap {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Aditya",88);
		map.put("Adi",60);
		map.put("Balu",92);
		map.put("Baba",91);
		map.put("char",90);
		Integer maxMarks = Collections.max(map.values());
		Integer minMarks = Collections.min(map.values());
		System.out.println("maximum marks of the student:"+maxMarks);
		System.out.println("minimum marks of the stundet:"+minMarks);
	}
}
