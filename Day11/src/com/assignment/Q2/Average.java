package com.assignment.Q2;

public class Average {

	public double calculateAverage(int[] age)
	{
		int count=0;
		int sum=0;
		for(int i=0;i<age.length;i++)
		{
			sum +=age[i];
			count++;
		}
		
		double avg=sum/count;
		return avg;
	}
}
