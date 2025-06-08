package com.java8code;

import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		List<Object> myList = List.of(0, 1, 1, 2, 3, 5, 6, 0, 0, 1);
		System.out.println(myList.size()); //prints 10
		HashSet<Object> set = new HashSet(myList);
		System.out.println(set);
		myList = List.of(set.toArray());
		System.out.println(myList.size());

	}

}
