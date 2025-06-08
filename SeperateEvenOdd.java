package com.java8code;

import java.util.*;
import java.util.stream.Collectors;

public class SeperateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = Arrays.asList(3,4,2,5,6,7,4,5);
		Map<Boolean, List<Integer>> partitions = ints.stream()
			    .collect(Collectors.partitioningBy(x -> x % 2 == 0));
			List<Integer> evens = partitions.get(true);
			List<Integer> odds = partitions.get(false);
			System.out.println("evens> "+evens);
			System.out.println("odds> "+odds);

	}

}
