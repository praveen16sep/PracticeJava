package com.javacoe;

public class Student {
	
	String studentName;
	int marks;
	
	public Student(String studentName, int i)
	{
		this.studentName=studentName;
		this.marks=i;
		
		
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", Marks=" + marks + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(Long marks) {
		marks = marks;
	}
	
	

}
