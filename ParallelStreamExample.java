package com.java8code;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Sequential Stream Output:");
        numbers.stream()
                .forEach(num -> System.out.println(num + " " + Thread.currentThread().getName()));

        System.out.println("\nParallel Stream Output:");
        numbers.parallelStream()
                .forEach(num -> System.out.println(num + " " + Thread.currentThread().getName()));
    }
}