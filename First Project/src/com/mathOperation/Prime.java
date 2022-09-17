package com.mathOperation;

public class Prime {

	public static void checkPrime(int a)
	{
		int count=0;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count>=2)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        checkPrime(27);
	}

}
