package com.assignment.Q4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		ArrayList<Employee> employee = new ArrayList<>();
		ArrayList<Department> department = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (true){
		System.out.println("Enter the details of Student "+(count++));
		System.out.println("Enter the Employee Id: ");
		
		int id= sc.nextInt();
		
		System.out.println("Enter the Employee Name : ");
		String name= sc.next();
		
		System.out.println("Enter the Employee Salary:");
		double marks= sc.nextInt();
		
        System.out.println("Enter the Department Id: ");
		
		int did= sc.nextInt();
		
		System.out.println("Enter the Department Name: ");
		String dname= sc.next();
		
		Department dep=new Department(did,dname);
		
		Employee emp = new Employee(id,name,marks);
		
		employee.add(emp);
		department.add(dep);
		
		System.out.println("Employee Details added successfully..");
		
		System.out.println("Want More (y/n) ?");
		String choice = sc.next();
		if(choice.equalsIgnoreCase("n"))
		break;
		}
		
		for(Employee em:employee)
		{
			System.out.println(em.getEmployeeName());
			System.out.println(em.getEmployeeSalary());
			System.out.println(em.getEmployeeId());
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
