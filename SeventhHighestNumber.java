package com.javacoe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SeventhHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 23, 45, 12, 34, 56, 78, 89, 100, 90, 80);
		
		Optional<Integer> a=numbers.stream().sorted(Comparator.reverseOrder()).skip(7).findFirst();
		if(a.isPresent())
		{
			int s=a.get();
			System.out.println(s);
		}
		
	
	}

}
