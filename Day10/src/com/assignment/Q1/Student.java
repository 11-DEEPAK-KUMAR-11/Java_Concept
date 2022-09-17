package com.assignment.Q1;

public class Student extends Person {

	int studentId=1 ; 
	String courseEnrolled="JA111" ; 
	int courseFee=300000 ; 

	Address ad=new Address();
	@Override
	public String toString() {
		return " Student [Student Id= " + studentId +", Course Enrolled= " + courseEnrolled + ", Course Fee= " + courseFee + ", Address [ City = " + ad.city +",State = "+ad.state+ ",Pincode= "+ad.pincode+ "]";
	}

}
