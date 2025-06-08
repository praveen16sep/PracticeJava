package com.java8code;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020);
		Employee e2=new Employee(2, "def", 28, 103, "M", "Manag", "Bl", 2021);
		 Set<Employee> std = new HashSet<Employee>();
		 std.add(e1);
		 std.add(e1);
		 std.add(e2);
		 
		 System.out.println(std.size());
		

	}

}
