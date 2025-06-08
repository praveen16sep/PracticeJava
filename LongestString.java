package com.java8.test;

import java.util.*;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays
	              .asList("apple", "banana", "cherry", "date", "grapefruit");
	Optional<String> longestString = strings
	              .stream()
	              .max(Comparator.comparingInt(String::length));
	
	System.out.println("longestString:: "+longestString);

	}

}
