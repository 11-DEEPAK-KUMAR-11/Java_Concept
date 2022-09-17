package com.assignment.que3;

public class Student {

	String name;
	int marks;
	int roll;
	
	void displayStudentDetails()
	{
		System.out.println("Roll is : "+roll);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student st1=new Student();
       st1.name="Swatantra";
       st1.roll=55;
       st1.marks=76;
       st1.displayStudentDetails();
       
       Student st2=new Student();
       st2.name="Sujay";
       st2.roll=12;
       st2.marks=75;
       st2.displayStudentDetails();
       
       st1=null;
       st2=null;
       
     //  st2.name="Deepak";
     //  st2.roll=12;
    //   st2.marks=75;
    //   st2.displayStudentDetails();
	}

}
