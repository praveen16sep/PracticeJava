package com.javacoe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentExample {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap();
		map.put("a", "test");
		map.put("b", "test");
		
		Iterator<Map.Entry<String, String>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> map1=itr.next();
			map.put("c", "ramesh");
		}
		
		

	}

}
