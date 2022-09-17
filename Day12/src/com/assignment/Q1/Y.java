package com.assignment.Q1;

public interface Y {

	public void funY();
	public default void defY()
	{
		System.out.println("Default method of Y interface");
	}
	
	public static void statY()
	{
		System.out.println("Static method of the Y interface");
	}
}
