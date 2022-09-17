package com.mathOperation;

public class Factorial {

	public static void findFactorial(int x)
	{
		int fact=1;
		for(int i=x;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       findFactorial(5);
	}

}
