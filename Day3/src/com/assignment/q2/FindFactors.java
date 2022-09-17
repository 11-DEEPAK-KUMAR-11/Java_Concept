package com.assignment.q2;

public class FindFactors {

	public static void factors(int x)
	{
		if(x<2 || x>100)
		{
			System.out.println("invalid number");
		}
		else
		{
			for(int i=1;i<=x;i++)
			{
				if(x%i==0)
				{
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       factors(100);
	}

}
