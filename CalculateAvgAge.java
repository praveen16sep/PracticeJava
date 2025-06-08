package com.java8.test;

import java.util.*;

public class CalculateAvgAge {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
			double averageAge = persons.stream()
			                          .mapToInt(Person::getAge)
			                          .average()
			                          .orElse(0);
			
			System.out.println("averageAge:: "+averageAge);
			CalculateAvgAge c=new CalculateAvgAge();
			c.printPrime();

	}
	
	public boolean isPrime(int number) {
		  if (number <= 1) {
		    return false;
		  }
		  for (int i = 2; i <= Math.sqrt(number); i++) {
		    if (number % i == 0) {
		        return false;
		    }
		  }
		  return true;
		}
		 
		private void printPrime() {
		  List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		  boolean containsPrime = numbers.stream()
		                                 .anyMatch(this::isPrime);
		  System.out.println("List contains a prime number: " + containsPrime);

		 }

}
