package com.evaluation.Q6;

import java.util.Scanner;

public class Main {

	public static double getStudent(int choice)
	{
		Scanner sc=new Scanner(System.in);
		double per=0.0;
		if(choice==1)
		{
			System.out.println("Enter Hindi Marks =>");
			int hindi=sc.nextInt();
			
			System.out.println("Enter English Marks =>");
			int eng=sc.nextInt();
			
			System.out.println("Enter History Marks =>");
			int history=sc.nextInt();
			
			ArtStudent art=new ArtStudent();
			
			art.setEnglishMarks(eng);
			art.setHindiMarks(hindi);
			art.setHistoryMarks(history);
			
			per=art.findPercentage();
			
		}
		
		if(choice==2)
		{
			System.out.println("Enter Physics Marks =>");
			int phy=sc.nextInt();
			
			System.out.println("Enter Chemistry Marks =>");
			int che=sc.nextInt();
			
			System.out.println("Enter Maths Marks =>");
			int maths=sc.nextInt();
			
			System.out.println("Enter Bio Marks =>");
			int bio=sc.nextInt();
			
			ScienceStudent scn=new ScienceStudent();
			scn.setBiologyMarks(bio);
			scn.setChemistryMarks(che);
			scn.setMathsMarks(maths);
			scn.setPhysicsMarks(phy);
			
			
			per=scn.findPercentage();
			
		}
		
		if(choice==3)
		{
			System.out.println("Enter Account Marks =>");
			int acc=sc.nextInt();
			
			System.out.println("Enter Economics Marks =>");
			int Eco=sc.nextInt();
			
			System.out.println("Enter Business Marks =>");
			int buss=sc.nextInt();
			
			CommerceStudent com =new CommerceStudent();
			com.setAccountMarks(acc);
			com.setBusinessStudiesMarks(buss);
			com.setEconomicsMarks(Eco);
			
			per=com.findPercentage();
			
		}
		
		
		return per;
	}
	
	
	public static void main(String[] args) {
		
      double ans=getStudent(2);
      System.out.println("Percentage is : "+ans);
      
      
	}

}
