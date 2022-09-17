package com.mathOperation;

public class Ludo {

	public static void main(String[] args) {
		int[] arr= {3,1,6,6,4,5};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i=i+2)
		{
			sum1 +=arr[i];
		}
		
		for(int i=1;i<arr.length;i=i+2)
		{
			sum2 +=arr[i];
		}
		
		if(sum1>sum2)
		{
			System.out.println("Player 1 won !");
		}
		
		else
		{
			System.out.println("Player 2 won !");
		}
	}

}
