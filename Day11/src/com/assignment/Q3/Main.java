package com.assignment.Q3;

public class Main {

	public static void main(String[] args) {


		Area a=new Area();
		int ar=a.circleArea(7);
		int arR=a.rectangleArea(4, 4);
		int arS=a.squareArea(8);
		
		System.out.println("Area of Circle : "+ar);
		System.out.println("Area of Rectangle : "+arR);
		System.out.println("Area of Square : "+arS);

	}

}
