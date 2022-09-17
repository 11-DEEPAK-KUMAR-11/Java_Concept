package com.assignment.Q3;

public class Bank {

	private Bank(){
	      System.out.println("Inside private constructor of Bank");
	   }

	public static Bank fun()
	{
		
		return new Bank();
	}
}
