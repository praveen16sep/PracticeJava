package com.javacoe;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class UniqueEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList= Arrays.asList(new Employee(123, "Ramesh"), 
				new Employee(234, "Rohit"),
				new Employee(234, "Rohit"),
				new Employee(456, "rakesh"),
				new Employee(123, "Ramesh"));
		//List<Employee> distinct= empList.stream().distinct().collect(Collectors.toList());
		/*
		 * for(int i=0 ; i<distinct.size() ; i++) System.out.println(distinct);
		 * distinct.forEach(System.out :: println);
		 * 
		 */
		 // Get unique employees by id
        List<Employee> uniqueEmployees = empList.stream()
            .filter(distinctByKey(emp -> emp.empId))
            .collect(Collectors.toList());

        uniqueEmployees.forEach(System.out::println);
    }

    // Utility method to filter distinct by key using a Set
    public static <T> java.util.function.Predicate<T> distinctByKey(java.util.function.Function<? super T, Object> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    
		
		
	}

}
