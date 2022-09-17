package com.evaluation.Q3;
import java.util.Scanner;
public class Ticket {

	int ticketid;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets, int a)
	{
//		int totalAmount=0;
		if(a-noOfTickets>0)
		{
			a -=noOfTickets;
			return noOfTickets*price;
		}
		
		
//		else
//		{
//			totalAmount=-1;
//		}
		return -1;
	}
	
	int availableTicket(int noOfTickets, int a)
	{
		return a-noOfTickets;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
//		 availableTickets=10;
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number of bookings : ");
		 int noOfBookings=sc.nextInt();
		 
		 System.out.println("Enter available Tickets : ");
		 int availableTickets=sc.nextInt();	
		 
		 
		 
		
		 
		 for(int i=0;i<noOfBookings;i++)
		 {
			 System.out.println("Enter Tickets Id : ");
			 int id=sc.nextInt();	
			 
			 System.out.println("Enter Tickets Price : ");
			 int p=sc.nextInt();	
			 
			 System.out.println("Enter the number of tickets : ");
			 int noOfTickets=sc.nextInt();
			 
			 Ticket d1=new Ticket();
			 d1.ticketid=id;
			 d1.price=p;
			
			 
			 System.out.println("Available Tickets : "+availableTickets);
			
			 System.out.println("Total amount : "+d1.calculateTicketCost(noOfTickets,availableTickets));
			 
			 System.out.println("Available Tickets after Booking : "+ d1.availableTicket(noOfTickets,availableTickets));
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
