package com.programs.javaexamples;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramGrouper {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "veil"};

        Map<String, List<String>> groupedAnagrams = Stream.of(words)
                .collect(Collectors.toMap(
                        AnagramGrouper::sortedKey,           // Key: sorted characters
                        word -> new ArrayList<>(List.of(word)), // Initial value: list with the word
                        (list1, list2) -> {                   // Merge function for duplicate keys
                            list1.addAll(list2);
                            return list1;
                        }
                ));

        // Output result
        groupedAnagrams.values().forEach(System.out::println);
    }

    private static String sortedKey(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}