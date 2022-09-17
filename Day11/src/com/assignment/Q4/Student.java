package com.assignment.Q4;

public class Student {

	 private int roll;
	private String name;
	private int marks;
	char grade;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void  displayDetails()
	{
		System.out.println("Roll number : "+getRoll());
		System.out.println("Name : "+getName());
		System.out.println("Marks : "+getMarks());
	}
	
	public char calculateGrade()
	{
		char grade=0;
		if(getMarks()>=500)
		{
			grade='A';
		}
		
		else if(getMarks()<500 && getMarks()>=400)
		{
			grade='B';
		}
		
		else if(getMarks()<400)
		{
			grade='C';
		}
		return grade;
	}

}
