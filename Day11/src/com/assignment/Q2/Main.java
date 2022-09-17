package com.assignment.Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter total no.of employees :");
      int people=sc.nextInt();
      
      
      int[] arr=new int[people];
      int index=0;
      for(int i=0;i<people;i++)
      {
    	  
    	  arr[index]=sc.nextInt();
    	  index++;
      }

//      for(int i=0;i<arr.length;i++)
//      {
//    	  System.out.print(arr[i]+" ");
//      }
      
      Average avg=new Average();
      double Average=avg.calculateAverage(arr);
      System.out.println("The average age is : "+Average);
      
      sc.close();
	}

}
