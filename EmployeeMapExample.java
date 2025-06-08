package com.java8StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
}

public class EmployeeMapExample {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice", "HR"),
            new Employee(102, "Bob", "IT"),
            new Employee(103, "Charlie", "Finance")
        );

        // Convert list to HashMap using streams
        Map<Integer, Employee> employeeMap = employees.stream()
            .collect(Collectors.toMap(Employee::getId, emp -> emp));

        // Print the HashMap
        employeeMap.forEach((id, emp) -> System.out.println(id + " -> " + emp));
    }
}