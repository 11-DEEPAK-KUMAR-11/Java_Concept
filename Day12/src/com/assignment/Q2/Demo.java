package com.assignment.Q2;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount)
	{
		Hotel hotel=null;
		if(amount>1000)
			hotel=new TajHotel();
			
		
		
		else if(amount>200 && amount<=1000)
		{
			hotel =new RoadSideHotel();
			
		}
		return hotel;
	}
	
	public static void main(String[] args) {
      
		Demo d1=new Demo();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int paisa=sc.nextInt();
		Hotel h=d1.provideFood(paisa);
        if(h!=null)
        {
        	h.chickenBiryani();
        	h.masalaDosa();
        	
        	if( h instanceof TajHotel)
        	{
        		TajHotel taj= (TajHotel)h;
				taj.welcomeDrink();

        	}
        }
        
        else
			System.out.println("Amount should be greater than 200");


	}

}
