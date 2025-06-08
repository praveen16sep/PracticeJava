package com.java8code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateWord {

	public static void main(String[] args) {
		String sentence = "alex brian alex charles alex charles david eric david";
		List<String> lisStr=Arrays.stream(sentence.split(" ")).collect(Collectors.toList());
		Set<String> tempSet= new HashSet<String>();
		
		List<String> duplicateWord= lisStr.stream().filter(s -> !tempSet.add(s)).collect(Collectors.toList());
		System.out.println(duplicateWord);
		

	}

}
