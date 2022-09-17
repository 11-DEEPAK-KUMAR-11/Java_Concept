package com.assignment.que2;

public class Lion {

	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	public static void printKillings()
	{
		System.out.println("Total killings by lions in jungle = " + totalDeaths);
	}
	void thinking()
	{
		if(isHungry==false)
		{
			System.out.println(name+ " sleeping" );
		}
		else if(isHungry==true && age>12)
		{
			totalDeaths +=2;
			System.out.println(name + " has eaten two animals");
		}
		
		else if(isHungry==true && age<=12 && age>=2)
		{
			totalDeaths +=1;
			System.out.println(name +" has eaten one animal");
		}
		
		else if(isHungry==true && age<2)
		{
			
			System.out.println(name +" is calling mom");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Lion lion1=new Lion();
        lion1.name="Buber";
        lion1.age=5;
        lion1.isHungry=true;;
        lion1.thinking();
        
        Lion lion2=new Lion();
        lion2.isHungry=true;
        lion2.name="Shera";
        lion2.age=13;
        lion2.thinking();
        
        Lion lion3=new Lion();
        lion3.name="King";
        lion3.isHungry=true;
         lion3.age=1;
         lion3.thinking();
        
        printKillings();
	}

}
