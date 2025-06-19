package com.program.java8Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "swiss";

        Optional<Character> firstNonRepeat = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new, // maintains insertion order
                Collectors.counting()
            ))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();

        System.out.println("First non-repeating character: " +
            firstNonRepeat.orElse(null));

	}

}
