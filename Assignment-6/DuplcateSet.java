package com.aaslin.java.assignments.assignment6;
import java.util.*;
public class DuplcateSet {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);
		// As per our perception it will returns the output as [1,2,3,1,2,3].But the output is [1,2,3] bacause
		// set doesn't allow duplicate values into it.

	}

}
