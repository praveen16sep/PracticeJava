package com.program.java8Stream;

public class StringLength {
	
	public static void main(String[] args) {
		String s="praveen";
		int count=(int) s.chars().mapToObj(c -> String.valueOf((char) c)).count();
		System.out.println(count);
	}

}
