package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoToArray {

	public static int[] addTwo(int[] arr)
	{
		int j=0;
		for(int i:arr)
		{
			arr[j]=i+2;
			j++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String[] strArr=sc.nextLine().split(" ");
		int[] arr=new int[strArr.length];
		
		for(int i=0;i<strArr.length;i++)
		{
			arr[i]=Integer.parseInt(strArr[i]);
		}
		int[] a=addTwo(arr);
		System.out.println(Arrays.toString(a));
		
	}

}
