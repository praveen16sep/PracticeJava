package com.programs.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TopperFinder {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 90),
            new Student("Charlie", 90),
            new Student("David", 80)
        );

        // Step 1: Find max marks
        OptionalInt maxMarks = students.stream()
                                       .mapToInt(Student::getMarks)
                                       .max();

        if (maxMarks.isPresent()) {
            int topMarks = maxMarks.getAsInt();

            // Step 2: Filter students with top marks
            List<Student> toppers = students.stream()
                                            .filter(s -> s.getMarks() == topMarks)
                                            .collect(Collectors.toList());

            // Step 3: Print result
            System.out.println("Topper(s):"+ toppers);
            //toppers.forEach(s -> System.out.println(s.getName() + " - " + s.getMarks()));
        } else {
            System.out.println("No students found.");
        }
    }
}


class Student {
    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // toString for printing
    @Override
    public String toString() {
        return name + " - " + marks;
    }
}