package com.assignment.Q1;

public class Instructor extends Person {

	int instructorId=123;
	int salary=70000;
	
	Address ad=new Address();
	@Override
	public String toString() {
		return " Instructor [Instructor Id= " + instructorId + ", salary= " + salary + ", Address [ City = " + ad.city +",State = "+ad.state+ ",Pincode= "+ad.pincode+ "]";
	}

}
