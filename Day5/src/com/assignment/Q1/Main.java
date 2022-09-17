package com.assignment.Q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 60.0;
		
		if(isSnowing==true || isRaining==true || temperature<50)
		{
			System.out.println("Let’s stay home.");
		}
		
		else
		{
			System.out.println("Let’s go out!");
		}
		//print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.

	}

}
