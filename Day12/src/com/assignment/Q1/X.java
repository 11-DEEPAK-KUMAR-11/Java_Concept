package com.assignment.Q1;

public interface X {
  
	public void funX();
	public default void defX()
	{
		System.out.println("Default method of X interface");
	}
	
	public static void statX()
	{
		System.out.println("Static method of the X interface");
	}
}
