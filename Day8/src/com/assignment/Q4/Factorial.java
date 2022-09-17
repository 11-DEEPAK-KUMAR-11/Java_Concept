package com.assignment.Q4;

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
    
		
		
		
		
//		System.out.println(args.length);
//		System.out.println(n);
		
		
		if(args.length==1)
		{
			int n = Integer.parseInt(args[0]);
			 findFactorial(n);
		}
		
		else if(args.length==2)
		{
			int n = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int n3=Math.abs(n-n2);
			findFactorial(n3);
		}
		
		else
		{
			System.out.println("Error");
		}
       
	}

}
