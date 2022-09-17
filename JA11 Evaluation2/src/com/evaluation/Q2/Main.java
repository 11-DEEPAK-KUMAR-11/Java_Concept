package com.evaluation.Q2;
import java.util.Scanner;


public class Main {

	
	
	  Student d1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Number of student wants to add : ");
      int num=sc.nextInt();
      
      sc.nextLine();
      
      System.out.println("Enter Name :");
	  String name= sc.nextLine();
		
		
	  System.out.println("Enter a roll :");
	  int roll1= sc.nextInt();
		
		
	  System.out.println("Enter marks :");
	  int marks= sc.nextInt();
	  
	  Main data=new Main();
	  
	  

	    data.d1=new Student();
		data.d1.setRollNumber(roll1);
		data.d1.setStudentName(name);
		
		data.d1.setMarks(marks);
		
//		data.d1=new Student(int roll1,"Swatantra", 26, 393);
		
		System.out.println("Details of 1st student-");
		
		System.out.println("Roll : "+data.d1.getRollNumber());
		System.out.println("Name : "+data.d1.getStudentName());
		System.out.println("Marks : "+data.d1.getMarks());
		
		System.out.println("===============================");
		System.out.println("Details of 2nd student-");
		
//		System.out.println("Roll : "+d2.getRoll());
//		System.out.println("Name : "+d2.getName());
//		System.out.println("Age : "+d2.age);
//		System.out.println("Marks : "+d2.marks);
//	  
		
//		System.out.println("The Roll is :"+roll);
//		System.out.println("The Name is :"+name);
//		System.out.println("The Marks is :"+marks);
		
	}

}
