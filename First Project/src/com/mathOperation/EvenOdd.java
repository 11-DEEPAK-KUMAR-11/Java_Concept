package com.mathOperation;

public class EvenOdd {
	
	public static void findEvenOdd(int x)
	{
		if(x%2==0)
		{
			System.out.println("Even Number");
		}
		else if(x%2!=0)
		{
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      findEvenOdd(12);
      findEvenOdd(111);
      findEvenOdd(120);
      findEvenOdd(13);
	}

}
