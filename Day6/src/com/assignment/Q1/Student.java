package com.assignment.Q1;

public class Student {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	Student()
	{
		
	}
	
	Student(int roll, String name, int age, int marks)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>18 && age<60)
		{
			this.age = age;
		}
		
		else
		{
			System.out.println("Enter valid Age");
		}
		
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		
		if(marks>0 && marks<500)
		{
			this.marks = marks;
		}
		
		else
		{
			System.out.println("Enter valid Marks");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student d1=new Student();
		d1.roll=1;
		d1.name="Deepak Kumar";
		d1.age=25;
		d1.marks=394;
		
		Student d2=new Student(2,"Swatantra", 26, 393);
		
		System.out.println("Details of 1st student-");
		
		System.out.println("Roll : "+d1.getRoll());
		System.out.println("Name : "+d1.getName());
		System.out.println("Age : "+d1.age);
		System.out.println("Marks : "+d1.marks);
		
		System.out.println("===============================");
		System.out.println("Details of 2nd student-");
		
		System.out.println("Roll : "+d2.getRoll());
		System.out.println("Name : "+d2.getName());
		System.out.println("Age : "+d2.age);
		System.out.println("Marks : "+d2.marks);
		
		
		
		
		
		
		
		
		

	}

}
