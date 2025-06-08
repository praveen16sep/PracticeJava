package com.javacoe;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyInEachChar {

	public static void main(String[] args) {
		String input = "Java is programming language";
		Map<Character, Long> frequencyEachChar= input.chars().mapToObj(c-> (char)c)
				                       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                 System.out.println(frequencyEachChar);
                 
                 List<String> ls=Arrays.asList("test", "ram", "test");
                 
                 List lsdistinct= ls.stream().distinct().collect(Collectors.toList());
                 
	}

}
