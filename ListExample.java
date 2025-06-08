package com.javacode.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		ls.add(2);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		ls.add(8);
		
		Iterator itr =ls.iterator();
		while(itr.hasNext())
		{
		  System.out.println(itr.next());
		}
		
	}

}
