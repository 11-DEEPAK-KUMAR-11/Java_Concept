package com.assignment.Q1;

public class Parrot extends Bird {

	@Override
	public void fly()
	{
		System.out.println("I am Flying");
		
	}
	public void sing()
	{
		System.out.println("I am Singing");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot d1=new Parrot();
		d1.fly();

	}

}
