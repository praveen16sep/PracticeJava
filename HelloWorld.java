package com.java8code;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class HelloWorld {

    public static <String> Map<String, Long>  frequencyMap(Stream<String> elements) {
        return elements.collect(
            Collectors.groupingBy(
            Function.identity(),
            HashMap::new, // can be skipped
            Collectors.counting()
            )
        );
    }

    public static void main( String args[] ) {
        List<String> words = Arrays.asList("hello", "hello", "mighty");
        System.out.println(frequencyMap(words.stream()));
    }
}