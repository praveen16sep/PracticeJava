package com.java8program;

import java.util.*;
import java.util.stream.Collectors;

public class SortingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<>(Arrays.asList(
		        new User("John", 33), 
		        new User("Robert", 26), 
		        new User("Mark", 26), 
		        new User("Brandon", 42)));

		List<User> sortedList = userList.stream()
		        .sorted(Comparator.comparingInt(User::getAge))
		        .collect(Collectors.toList());

		sortedList.forEach(System.out::println);
		System.out.println("----------------------");
		
		List<User> sortedList1 = userList.stream()
		        .sorted(Comparator.comparingInt(User::getAge).reversed())
		        .collect(Collectors.toList());

		sortedList1.forEach(System.out::println);
		
		
		
		//Defining a Custom Comparator with Stream.sorted()
		List<User> sortedList2 = userList.stream()
		        .sorted((o1, o2) -> {
		            if(o1.getAge() == o2.getAge())
		                return o1.getName().compareTo(o2.getName());
		            else if(o1.getAge() > o2.getAge())
		                return 1;
		            else return -1;
		        })
		        .collect(Collectors.toList());

		sortedList2.forEach(System.out::println);
		
		
		//e've used a Lambda expression to create a new Comparator implicitly and defined the logic for sorting/comparison.
		
		Comparator<User> customComparator = new Comparator<User>() {
		    @Override
		    public int compare(User o1, User o2) {
		        if(o1.getAge() == o2.getAge())
		            return o1.getName().compareTo(o2.getName());
		        else if(o1.getAge() > o2.getAge())
		            return 1;
		        else return -1;
		    }
		};

		List<User> sortedList3 = userList.stream()
		        .sorted(customComparator)
		        .collect(Collectors.toList());
		
		
		//make an anonymous instantiation of the comparator in the sorted() call:
		
		List<User> sortedList4 = userList.stream()
		        .sorted(new Comparator<User>() {
		            @Override
		            public int compare(User o1, User o2) {
		                if(o1.getAge() == o2.getAge())
		                    return o1.getName().compareTo(o2.getName());
		                else if(o1.getAge() > o2.getAge())
		                    return 1;
		                else return -1;
		            }
		        })
		        .collect(Collectors.toList());

	}

}
