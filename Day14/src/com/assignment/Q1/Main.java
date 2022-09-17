package com.assignment.Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> cities=new ArrayList<>();
		cities.add("Delhi");
		cities.add("Haridwar");
		cities.add("Mumbai");
		cities.add("Chandigarh");
		cities.add("Bijnor");
		
		//enhanced for loop
		for(String str:cities)
		{
			System.out.println(str);
		}
		System.out.println();
		System.out.println("========================");
		System.out.println();
		// for loop
		
		for(int i=0;i<cities.size();i++)
		{
			String s=cities.get(i);
			System.out.println(s);
		}
		
		//by using iterator
		
		 Iterator<String> iter= cities.iterator();

     // Displaying the values after iterating
     // through the list
     System.out.println("\nThe iterator values"+ " of list are: ");
     
     while (iter.hasNext()) {
         System.out.print(iter.next() + " ");
     }
		
	}
}
