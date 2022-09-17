package com.assignment.que4;

public class EvenOdd {

	void findEvenOdd(int x)
	{
		if(x%2==0)
		{
			double y=x/10.0 ;
			System.out.println(Math.ceil(y)*10);
		}
		
		else if(x!=0)
		{
			System.out.println(x);
		}
		
		else if(x<0)
		{
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EvenOdd find=new EvenOdd();
        find.findEvenOdd(14);
        find.findEvenOdd(45);
        find.findEvenOdd(-5);
	}

}
