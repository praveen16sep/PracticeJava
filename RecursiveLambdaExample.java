package com.java8.test;
public class RecursiveLambdaExample {
    public static void main(String[] args) {
        RecursiveFunction<Integer, Integer> factorial = (self, n) -> {
            if (n <= 1) return 1;
            return n * self.apply(self, n - 1);
        };

        int number = 5;
        int result = factorial.apply(factorial, number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}


@FunctionalInterface
interface RecursiveFunction<T, R> {
    R apply(RecursiveFunction<T, R> self, T t);
}