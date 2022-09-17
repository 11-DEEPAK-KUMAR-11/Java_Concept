package com.mathOperation;

public class Factors {

	public static void findFactors(int y)
	{
		for(int i=1;i<=y;i++)
		{
			if(y%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      findFactors(12);
	}

}
