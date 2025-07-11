package com.aaslin.java.assignments.assignment6;
import java.util.*;
import java.util.Map.Entry;
public class CharacterCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name:");
		String string = scanner.nextLine(); // If we are given capital letters in the string then convert the whole string to 
		// small letters by using toLowerCase()
		Map<Character,Integer> map = new HashMap<>();
		for(char character:string.toCharArray()) {
			if(map.containsKey(character)) {
				map.put(character, map.get(character)+1);
			}
			else {
				map.put(character, 1);
			}
		}
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}
}
