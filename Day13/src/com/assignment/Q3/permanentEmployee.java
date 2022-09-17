package com.assignment.Q3;

public class permanentEmployee extends Employee{

	private double basicPay;
	
	public permanentEmployee()
	{
		
	}
	
	public permanentEmployee(int employeeId,String employeeName,double basicPay)
	{
		this.basicPay=basicPay;
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.calculateSalary();
	}
	
	
	
	@Override
	public void calculateSalary() {

		double pfAmount = basicPay *(0.12);
		salary = basicPay - pfAmount;
		
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

}
