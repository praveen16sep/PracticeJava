package com.java8code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GetEmployeeDetailsBasedOnOperation {

	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<Employee>();
				//Arrays.asList(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020), new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
		//GroupBy Employee by city
		Map<String, List<Employee>> empByCity=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("empByCity: "+empByCity);
		
		Optional<Employee> emp = empList.stream()
		        .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(emp);
		System.out.println("------------------------------------");
		
		Optional<Employee> emp1 = empList.stream()
		        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

		System.out.println(emp1.get());
		System.out.println("------------------------------------");
		
		
		// Find employees whose age is greater than 30 and less than 30

		System.out.println("Employees whose age is greater than 25 and less than 25");

		// Partition employees by age using Collectors.partitioningBy()

		Map<Boolean, List<Employee>> partitionEmployeesByAge = empList.stream()

		 .collect(Collectors.partitioningBy(e -> e.getAge() > 30));

		// Iterate through the partitioned map and print the results

		Set<Map.Entry<Boolean, List<Employee>>> empSet = partitionEmployeesByAge.entrySet();

		for (Map.Entry<Boolean, List<Employee>> entry : empSet) {

		 if (Boolean.TRUE.equals(entry.getKey())) {

		 // Employees greater than 30 years old

		 System.out.println("Employees greater than 30 years ::" + entry.getValue());

		 } else {

		 // Employees less than 30 years old

		 System.out.println("Employees less than 30 years ::" + entry.getValue());

		 }

		}
		
		
		System.out.println("-----------------555555-------------------");
		List<Employee> listOfEmployee= empList.stream().filter(e-> e.getSalary()>3000).collect(Collectors.toList());

		listOfEmployee.forEach(e->System.out.println("All salary: "+e.getSalary()));
		
		
		
	}

}
