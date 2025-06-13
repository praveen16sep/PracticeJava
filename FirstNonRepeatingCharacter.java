package com.java8.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
        String s = "aabccdb";
        Character result = findFirstNonRepeatingChar(s);

        if (result != null) {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static Character findFirstNonRepeatingChar(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // No non-repeating character found
    }

}
