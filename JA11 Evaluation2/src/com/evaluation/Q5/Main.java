package com.evaluation.Q5;

import java.util.Scanner;

public class Main {

	static Employee D=new Employee();
	
	public static Employee getEmployeeDetails()
	{
//		System.out.println("Id : "+D.getEmployeeId());
//		System.out.println("Name : "+D.getEmployeeName());
//		System.out.println("Salary : "+D.getSalary());
//		System.out.println("Net Salary : "+D.getNetSalary());
		
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Id");
		     int id=sc.nextInt();
		     
		     sc.nextLine();
		     System.out.println("Enter name");
		     String name1=sc.nextLine();
		     
		     System.out.println("Enter salary");
		     int s=sc.nextInt();
		     
		     System.out.println("Enter PF Percentage :");
		     int net=sc.nextInt();
		     
		     
			Employee d1=new Employee();
			d1.setEmployeeName(name1);
			d1.setSalary(s);
//		    d1.setNetSalary(net);
		    d1.setEmployeeId(id);
		    d1.calculateNetSalary(net);
		   
		  return d1;
		
//		System.out.println(D.getEmployeeName());
//		return new Employee();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  
	   
	  
		Employee details=getEmployeeDetails();
		Employee details1=getEmployeeDetails();
//		System.out.println("Id"+details.getEmployeeId());
//		System.out.println("Nmae"+details.getEmployeeName());
//		System.out.println("Salary "+details.getSalary());
//		System.out.println("Net Salary "+details.getNetSalary());
		
		details.displayDetails();
        System.out.println("======================================");
        details1.displayDetails();
        
	}

}
