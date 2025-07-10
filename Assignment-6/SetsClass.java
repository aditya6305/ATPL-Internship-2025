package com.aaslin.java.assignments.assignment6;
import java.util.*;
public class SetsClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of set1:");
		int size1 = scanner.nextInt();
		System.out.println("Enter the size of set2:");
		int size2 = scanner.nextInt();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		System.out.println("Enter set1 elements");
		for(int iteration =0; iteration<size1;iteration++) {
		set1.add(scanner.nextInt());
		}
		System.out.println("Enter set2 elements");
		for(int iteration = 0; iteration<size2;iteration++) {
			set2.add(scanner.nextInt());
			}
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection of two sets s1 and s2 is: "+intersection);
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union of two sets s1 and s2 is: "+union);
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println("Difference of two sets s1 and s2 is: "+difference);
	}

}
