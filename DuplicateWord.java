package com.program.java8Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWord {

	public static void main(String[] args) {
		String sentence="i a love Indian i will a stay in india i am indian a so i love it";
		List<String> ls=Arrays.stream(sentence.split(" ")).collect(Collectors.toList());
		
		Set<String> tempset=new HashSet<String>();
		List<String> dupWord=ls.stream().filter(s->!tempset.add(s)).collect(Collectors.toList());
		System.out.println(dupWord);
		

	}

}
