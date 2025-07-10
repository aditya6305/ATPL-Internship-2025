package com.aaslin.java.assignments.assignment6;
import java.util.*;
public class WordFrequency {

	public static void main(String[] args) {
		String paragraph="I am aditya.I worked as intern in aaslin. I am aditya.I worked as intern in aaslin";
		Map<String,Integer> map = new HashMap<>();
		String[] words=paragraph.toLowerCase().split("\\s+");
		for(String word:words) {
			word=word.replaceAll("[^a-z]","");
			if(!word.isEmpty()) {
				if(map.containsKey(word)) {
					map.put(word, map.get(word)+1);
				}
				else {
					map.put(word, 1);
				}
			}
		}
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
