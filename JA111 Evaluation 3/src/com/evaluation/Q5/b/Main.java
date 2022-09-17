package com.evaluation.Q5.b;

public class Main {

	public static void main(String[] args) {
		
		FuelCar fuelCar=new FuelCar();
		fuelCar.run();
		fuelCar.service();
		
		ElectricCar ele=new ElectricCar();
		ele.run();
		ele.service();

	}

}
