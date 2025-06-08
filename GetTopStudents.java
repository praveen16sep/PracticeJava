package com.javacoe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class GetTopStudents {

	public static void main(String[] args) {
		List<Student> ls=Arrays.asList(new Student("Rahul", 85),new Student("Rohit", 95), new Student("Ramesh", 95));
		
	//Optional<Integer> topstudents=ls.stream().map(s->s.getMarks()).max(Integer :: compareTo);
		
	//Map<String, Integer> topstudents=ls.stream().
		//	collect(Collectors.groupingBy(Student-> Student.getStudentName(), max(Student :: getMarks)));
	
		OptionalInt maxMarks= ls.stream().mapToInt(Student :: getMarks).max();
	System.out.println(maxMarks);
	
	if(maxMarks.isPresent())
	{
		int topMarks= maxMarks.getAsInt();
		
		List<Student> toppers=ls.stream().filter(S->S.getMarks()==topMarks).collect(Collectors.toList());
		System.out.println("toppers: "+toppers);
	}
	
	//System.out.println(topstudents);

	}

}
