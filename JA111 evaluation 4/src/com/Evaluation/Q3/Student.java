package com.Evaluation.Q3;

import java.util.TreeSet;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private int mathMarks;
	private int scienceMarks;
	private int engMarks;
	private int total;
	
	
	
	public Student(int rollNo, String name, int mathMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
		
		this.setTotal();
	}

	
	

	public int getRollNo() {
		return rollNo;
	}




	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getMathMarks() {
		return mathMarks;
	}




	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}




	public int getScienceMarks() {
		return scienceMarks;
	}




	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}




	public int getEngMarks() {
		return engMarks;
	}




	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}




	public int getTotal() {
		return total;
	}




	public void setTotal() {
		total=this.engMarks+this.mathMarks+this.scienceMarks;
		
	}




	@Override
	public int compareTo(Student s) {
		if(this.getTotal() > s.getTotal())
			return +1;
		else if(this.getTotal() < s.getTotal())
			return -1;
		else
	return s.getName().compareTo(this.getName());
		

	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathMarks=" + mathMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + ", total=" + total + "]";
	}




	public static void main(String[] args) {
		
		TreeSet<Student> student=new TreeSet<>();
		student.add(new Student(1,"Deepak",90,95,80));
		student.add(new Student(2,"Kapil",90,95,80));
		student.add(new Student(3,"Rishabh",90,95,80));
		
		for(Student st:student)
		{
			System.out.println(st);
		}
	}
	
	
}
