package com.assignment.Q3;

public class Loan {

	double loanAmount=0.0;
	public double calculateLoanAmount(Employee employeeObj)
	{
		
		if(employeeObj instanceof permanentEmployee)
		{
			permanentEmployee pe=(permanentEmployee) employeeObj;
			loanAmount=pe.salary*.15;
		}
		
		else if(employeeObj instanceof temporaryEmployee)
		{
			temporaryEmployee te=(temporaryEmployee) employeeObj;
			loanAmount=te.salary*.10;
		}
		return loanAmount;
		
	}
	
	private Loan()
	{
		
	}
	
	public static Loan loanMethod()
	{
		return new Loan();
	}
}
