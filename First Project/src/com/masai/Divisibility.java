package com.masai;

public class Divisibility {


	  public static void checkDivisibility(int x)
	  {
	     if(x%5==0 && x%3==0)
	     {
	       System.out.println("Hello Welcome");
	     }
	     
	    else if(x%5==0)
	   {
	       System.out.println("Hello");
	    }
	   
	   else if(x%3==0)
	    {
	      System.out.println("Welcome");
	    }
	    else 
	    	System.out.println("invalid number");

	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkDivisibility(23);
	}

}
