package com.assignment.Q4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter roll number ; ");
       int roll=sc.nextInt();
       
       sc.nextLine();
       System.out.println("Enter Name : ");
       String name=sc.nextLine();
       
       System.out.println("Enter Marks : ");
       int marks=sc.nextInt();
       
       Student st1=new Student();
       st1.setMarks(marks);
       st1.setName(name);
       st1.setRoll(roll);
       
       st1.displayDetails();
       char score=st1.calculateGrade();
       
       System.out.println("Grade : "+score);
       

       sc.close();
	}

}
