package com.mathOperation;

public class SumOfEvenOdd {

	public static void findSumOfEvenOdd(int x)
	{
		int sum_even=0;
		int sum_odd=0;
		for(int i=1;i<=x;i++)
		{
			if(i%2==0)
			{
				sum_even=sum_even+i;
			}
			else
			{
				sum_odd +=i;
			}
		}
		System.out.println("Even Sum :"+sum_even+" Odd Sum : "+sum_odd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       findSumOfEvenOdd(10);
	}

}
