package com.java8code;

import java.util.*;
import java.util.stream.*;

public class Demo01 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        // Sample data
        studentList.add(new Student(1, "Alice", Arrays.asList(1, 2)));
        studentList.add(new Student(2, "Bob", Arrays.asList(1)));
        studentList.add(new Student(3, "Charlie", Arrays.asList(2, 3)));
        studentList.add(new Student(4, "David", Arrays.asList(4)));

        departmentList.add(new Department(1, "Computer Science"));
        departmentList.add(new Department(2, "Electronics"));
        departmentList.add(new Department(3, "Mechanical"));
        departmentList.add(new Department(4, "Civil"));

        // Map: deptId -> list of students
		/*
		 * Map<Integer, Long> deptToStudentCount = studentList.stream() .flatMap(s ->
		 * s.getDeptIds().stream().map(deptId -> new AbstractMap.SimpleEntry<>(deptId,
		 * s))) .collect(Collectors.groupingBy(Map.Entry::getKey,
		 * Collectors.counting()));
		 */
        
        Map<Integer, Long> deptToStudentCount = studentList.stream()
                .flatMap(s -> s.getDeptIds().stream())
                .collect(Collectors.groupingBy(deptId->deptId, Collectors.counting()));

        // Filter departments with at least 2 students
        List<Department> result = departmentList.stream()
            .filter(d -> deptToStudentCount.getOrDefault(d.getDepartmentId(), 0L) >= 2)
            .collect(Collectors.toList());

        // Print result
        result.forEach(d -> System.out.println(d.getDeptName()));
    }
}

// Student class
class Student {
    private Integer student_id;
    private String name;
    private List<Integer> deptIds;

    public Student(Integer student_id, String name, List<Integer> deptIds) {
        this.student_id = student_id;
        this.name = name;
        this.deptIds = deptIds;
    }

    public List<Integer> getDeptIds() {
        return deptIds;
    }
}

// Department class
class Department {
    private Integer departmentId;
    private String deptName;

    public Department(Integer departmentId, String deptName) {
        this.departmentId = departmentId;
        this.deptName = deptName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getDeptName() {
        return deptName;
    }
}