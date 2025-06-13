package com.TestExample.Exception;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxCharAndSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabbccccdddd";

				//Map<Character, Long> charcount=input.chars().mapToObj(c->(Char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		   Map<Character, Long> frequencyMap = input.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(
	                        Function.identity(),
	                        Collectors.counting()
	                ));
		   Optional<Map.Entry<Character, Long>> maxEntry = frequencyMap.entrySet().stream()
	                .max(Map.Entry.comparingByValue());

		   
				 //Optional opt=charcount.entrySet().stream().max(comparator.comparing(Map.entry :: getValue)).orElse(nulll);
				 
	       maxEntry.ifPresent(e ->
           System.out.println(e.getKey() + "" + e.getValue())
   );

	}

}
