package com.mathOperation;

public class AverageOfEven {

	public static void  findAverageOfEven(int x)
	{
		int sum_even=0;
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(i%2==0)
			{
				sum_even +=i;
				count++;
			}
		}
		double avg=sum_even/count;
		System.out.println(avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       findAverageOfEven(10);
	}

}
