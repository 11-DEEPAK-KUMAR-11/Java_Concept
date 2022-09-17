package com.evaluation.Q5;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	Employee()
	{
		
	}
	
	Employee(int employeeId, String employeeName, double salary,double netSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		this.netSalary=netSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public double getNetSalary() {
		return netSalary;
	}



	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}



	
	public void calculateNetSalary(int pfPercentage)
	{
		double netSalary=salary-pfPercentage*salary/100;
		
		setNetSalary(netSalary);
//		System.out.println(netSalary);
	}
	
	
	void displayDetails()
	{
		System.out.println("Id : "+getEmployeeId());
		System.out.println("Nmae : "+getEmployeeName());
		System.out.println("Salary : "+getSalary());
		System.out.println("Net Salary : "+getNetSalary());
		
	}
		
		
		
		
		
		
		
		
		
		
}
