package com.pattern;

public class Type6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=16;
       for(int i=4;i>=0;i--)
       {
    	   for(int j=0;j<=i;j++)
    	   {
    		   System.out.print(num+" ");
    		   num--;
    	   }
    	   System.out.println();
       }
	}

}
