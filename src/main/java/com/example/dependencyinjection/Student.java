package com.example.dependencyinjection;

public class Student {

	private int id;
	private String studentName;
	
	

	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
		
	public void showStudentInfo() {
		System.out.println("The Student Name is: " + studentName + " the id is: " + id);
	}

}
