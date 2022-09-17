package com.assignment.Q4;

public class Main {

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println("Prime Numbers : ");
		
		int[] arr= t.display(17);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
