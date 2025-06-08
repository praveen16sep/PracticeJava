package com.java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		 list.stream().filter(t-> t%2==0).forEach(System.out :: println);
		 
		 
		 /* or can also try below method */
		  int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		    Map<Boolean, List<Integer>> list1 = Arrays.stream(nums).boxed()
		    .collect(Collectors.partitioningBy(num -> num % 2 == 0));


		    // Printing the result
	        System.out.println("Even numbers: " + list1.get(true));
	        System.out.println("Odd numbers: " + list1.get(false));
		
	}

}
