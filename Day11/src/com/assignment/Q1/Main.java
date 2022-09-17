package com.assignment.Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of passenger : ");
		int numPassenger=sc.nextInt();
		
		System.out.println("Enter number of kms : ");
		int numKms=sc.nextInt();
		
		Car sd=new Sedan();
		sd.numberOfPassenger=numPassenger;
		sd.numberOfKms=numKms;
		System.out.println("passenger "+sd.getNumberOfPassenger());
		
		OLA ola=new OLA();
		Car myCar=ola.bookCar(numPassenger, numKms);

		System.out.println(myCar.numberOfKms);
		int res=ola.calculateBill(myCar);
		System.out.println("The total fare amount is "+ res);

	}

}
