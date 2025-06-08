package com.java8program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInDecendingOrd {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 23, -4, 0, 18);
		List<Integer> sortedList = list.stream()
		        .sorted(Collections.reverseOrder())
		        .collect(Collectors.toList());

		System.out.println(sortedList);
	}
}
