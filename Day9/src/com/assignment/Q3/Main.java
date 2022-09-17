package com.assignment.Q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Main m=new Main();
		
		Manager d=new Manager();
		d.Address="Haridwar";
		d.Age=25;
		d.Name="Kapil";
		d.number="887654324";
		d.Salary=70000;
		d.Department="IT";
		
		d.showDetails();
		System.out.println("==========================================");
		
		
	   Employee d2=new Employee();
		d2.Address="Haridwar";
		d2.Age=26;
		d2.Specialisation="Developer";
		d2.Name="Deepak";
		d2.number="7011475228";
		d2.Salary=80000;
		
		d2.showDetails();
	
		
//		d.Specialisation="Developer"; 
		
	}

}
