package com.assignment.Q1;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		Car car=null;
		if(numberOfPassenger<=3)
		{
			   car=new HatchBack();
			   car.getNumberOfKms();
			   car.getNumberOfPassenger();
		}
		
		else
		{
			  car=new Sedan();
		}
		return car;
	}
	public int calculateBill(Car car)
	{
		int Totalfare=car.getNumberOfKms()*20;
		return Totalfare;
	}
}
