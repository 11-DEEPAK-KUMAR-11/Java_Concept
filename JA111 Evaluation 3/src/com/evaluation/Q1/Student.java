package com.evaluation.Q1;

public class Student {

	
	private int Roll;
	private String Name;
	private int Marks;
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	Student()
	{
		
	}
	
	Student(int Roll,String Name,int Marks)
	{
		this.Marks=Marks;
		this.Name=Name;
		this.Roll=Roll;
	}
}
