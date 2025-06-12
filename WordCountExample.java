package com.java8code;
import java.util.Arrays;
import java.util.List;

public class WordCountExample {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList(
            "Apple is a fruit.",
            "I like apple pie.",
            "APPLE cider is tasty."
        );

        int count = wordCount(lines, "apple");
        System.out.println("Count: " + count); // Output: 3
    }

    public static int wordCount(List<String> lines, String word) {
        return (int) lines.stream()
            .flatMap(line -> Arrays.stream(line.split("\\W+"))) // split by non-word characters
            .filter(w -> w.equalsIgnoreCase(word))
            .count();
    }
}