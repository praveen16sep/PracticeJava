package com.java8.test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatCharString {

	public static void main(String[] args) {
		String input = "vivek kadiyal";
		//Optional<Character> repeatedChar= findFirstRepeat(input);
		
Set<Character> setchar= new HashSet<Character>();
		
		Map<Character, Long> mapchar= input.chars().mapToObj(C->(char)C)
				                   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		 mapchar.entrySet().stream().filter(c->!setchar.add(c)).forEach(System.out::println);
				                   
				          

	}
	


}
