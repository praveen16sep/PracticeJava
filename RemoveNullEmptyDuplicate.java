package com.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullEmptyDuplicate {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("", null, "Arun", "Binod", " ", "Chetan", " arun ", "binod", "chetan");
		List<String> filteredList = strings.stream()
		.filter(Objects:: nonNull)
		.map(String::trim)
		.filter(s->!s.isEmpty())
		.map(String::toLowerCase) 
		.distinct().collect(Collectors.toList());
		
		System.out.println(filteredList);

	}

}
