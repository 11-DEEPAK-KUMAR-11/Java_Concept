package com.assignment.Q3;

public class Member {

	 String Name;
	 int Age ;
	 String number ;
	 String Address ; 
	 double Salary ;
	 
	 public Member()
	 {
		 
	 }
	 
	 Member( String Name,int Age,String number,String Address,double Salary )
	 {
		 this.Name=Name;
		 this.Age=Age;
		 this.number=number;
		 this.Address=Address;
		 this.Salary=Salary;
		 
	 }
	 
	 void printSalary()
	 {
		 System.out.println(Salary);
	 }
	 
	
}
