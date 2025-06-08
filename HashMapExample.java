package com.javacode.collections;

import java.util.*;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("ram ", 1);
		map.put("Mohan", 2);
		map.put("Test", 3);
		/*
		 * Map<String, String> myMap = new HashMap<>() {{ put("a", "b"); put("c", "d");
		 * }};
		 */
		for(Map.Entry<String,Integer> m : map.entrySet())
		{
			String key=m.getKey();
			int value=m.getValue();
		}
		
		Iterator<Map.Entry<String, Integer>> itr= map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> mp=itr.next();
			String key=mp.getKey();
			int value=mp.getValue();
		}
		
		
	}

}
