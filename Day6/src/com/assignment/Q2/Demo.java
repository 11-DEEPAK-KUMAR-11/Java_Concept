package com.assignment.Q2;

public class Demo {

	Demo()
	{  this(true);
		System.out.println("Thank You !");
	}
	
	Demo(int i)
	{
		System.out.print("You got "+i+" Marks in");
	}
	
	Demo(String x)
	{   this(78);
		System.out.println(x);
	}
	
	Demo(Boolean a)
	{  this(" Gate Examination.");
		System.out.println("Passed the Examination : "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo d=new Demo();
//        System.out.println(new Demo());
	}

}
