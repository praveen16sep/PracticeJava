package com.java8.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharString {

	public static void main(String[] args) {
		String s="rameshbabu";
		Map<Character, Long> l=s.chars().mapToObj(c -> (char)c)
				               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		 List<String> items =
	                Arrays.asList("apple", "apple", "banana",
	                        "apple", "orange", "banana", "papaya");

	        Map<String, Long> result =
	                items.stream().collect(
	                        Collectors.groupingBy(
	                                Function.identity(), Collectors.counting()
	                        )
	                );
	        
	        System.out.println(result);
	        
	        Map<String, Long> finalMap = new LinkedHashMap<>();

	        //Sort a map and add to finalMap
	        result.entrySet().stream()
	                .sorted(Map.Entry.<String, Long>comparingByValue()
	                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

	        System.out.println(finalMap);

	}

}
