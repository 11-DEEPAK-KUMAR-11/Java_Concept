package com.assignment.Q3;

public class Student {

	private int roll;
	private String name;
	private String address;
	private String collegeName;
	
	public Student()
	 {
		 
	 }
	
	public Student(int roll, String name, String address, String collegeName)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collegeName=collegeName;
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public static Student getStudent(boolean isFromNIT)
	{
		if(isFromNIT==true)
		{
			Student yes=new Student(10, "DEEPAK","HARIDWAR","NIT");
			System.out.println("Roll : "+yes.getRoll());
			System.out.println("Name : "+yes.getName());
			System.out.println("Age : "+yes.address);
			System.out.println("Marks : "+yes.collegeName);
			
		}
		
		else
		{
			Student yes=new Student(1, "Swatantra","BINOR","NON-NIT");
			System.out.println("Roll : "+yes.getRoll());
			System.out.println("Name : "+yes.getName());
			System.out.println("Age : "+yes.address);
			System.out.println("Marks : "+yes.collegeName);
			
		}
		return new Student();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       getStudent(false); 
	}

}
