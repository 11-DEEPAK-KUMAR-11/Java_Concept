package com.assignment.Q3;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		
		int area=length*breadth;
		
		return area;
	}

	@Override
	public int squareArea(int side) {
        int area=side*side;
       
		return area;
	}

	@Override
	public int circleArea(int radius) {

       int area=(int) (radius*radius*Math.PI);
		return area;
	}

}
