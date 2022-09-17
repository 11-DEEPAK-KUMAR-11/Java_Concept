package com.assignment.Q4;

public class Test implements Intr {

	@Override
	public int[] display(int p) {
		
		int count=0;
		for(int i=0;i<=p;i++)
		{
			if(isPrime(i))
			{
				count++;
			}
		}
		int[] prime=new int[count];
		int index=0;
		for(int i=0;i<=p;i++)
		{
			if(isPrime(i))
			{
				prime[index]=i;
				index++;
			}
		}
		return prime;
	}
	
	public static boolean isPrime(int n) {

		   for (int i = 2; i <n; i++) {
		        if(n % i == 0)
		            return false;
		    }

		    if (n < 2) return false;

		    return true;
		}

	
}
