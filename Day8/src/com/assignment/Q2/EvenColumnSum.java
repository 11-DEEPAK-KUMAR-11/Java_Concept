package com.assignment.Q2;

import java.util.Scanner;

public class EvenColumnSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers of rows : ");
		int row=sc.nextInt();
		System.out.println("Enter Numbers of col : ");
		int col=sc.nextInt();
		System.out.println("Enter elements for matrix "+row*col);
		
		
		int[][] arr=new int[row][col];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int j=0;j<arr.length;j++)
		{   int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i][j]%2==0)
				{
					sum +=arr[i][j];
				}
				
			}
			System.out.print(sum);
			System.out.println();
		}
		
		
		sc.close();
		
		

	}

}
