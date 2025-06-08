package com.java8code;

import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesCustomObjects {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Alice", 30),
            new Person("John", 25),
            new Person("Bob", 20)
        );

        List<Person> uniquePeople = people.stream()
                                          .distinct()  // Remove duplicates based on equals and hashCode
                                          .collect(Collectors.toList());
		/*
		 * Set<Person> set = people.stream() .collect(Collectors.toCollection(() -> new
		 * TreeSet<>(Comparator.comparing(Person::getName))));
		 * 
		 * List<Person> modified = people.stream()
		 * .collect(Collectors.toCollection(()->new
		 * TreeSet<>(Comparator.comparing(Person::getName)))).stream().collect(
		 * Collectors.toList());
		 */

        System.out.println("Unique people: " + uniquePeople);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}