package com.javacoe;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "abcabcdbb";
	        String result = longestUniqueSubstring(input);
	        System.out.println("Longest unique substring: " + result);  // Output: "abc"
		

	}

	/*private static String longestUniqueSubstring(String s) {
		List<String> allSubstrings = IntStream.range(0, s.length())
			    .boxed()
			    .flatMap(i -> IntStream.range(i + 1, s.length() + 1)
			        .mapToObj(j -> s.substring(i, j)))
			    .filter(sub -> sub.chars().distinct().count() == sub.length())
			    .collect(Collectors.toList());

			String longest = allSubstrings.stream()
			    .max(Comparator.comparingInt(String::length))
			    .orElse("");
		return longest;
	}*/
	

	    public static String longestUniqueSubstring(String s) {
	        Map<Character, Integer> indexMap = new HashMap<>();
	        int start = 0, maxLen = 0, startOfMax = 0;

	        for (int end = 0; end < s.length(); end++) {
	            char currentChar = s.charAt(end);
	            if (indexMap.containsKey(currentChar) && indexMap.get(currentChar) >= start) {
	                start = indexMap.get(currentChar) + 1;
	            }
	            indexMap.put(currentChar, end);
	            if (end - start + 1 > maxLen) {
	                maxLen = end - start + 1;
	                startOfMax = start;
	            }
	        }

	        return s.substring(startOfMax, startOfMax + maxLen);
	    }
	

}
