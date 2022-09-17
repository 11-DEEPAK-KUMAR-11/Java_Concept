//Q1) Write the logic to reverse the String given in the parameter without the help of predefined
//reverse method and return the reversed String:(HINT use Array)
//

package com.assignment.Q1;

import java.util.Scanner;

public class Main {
	
public static String reverseString(String orignalString) {
		
		StringBuilder sb = new StringBuilder("");
		
 		
		
		
		char[] chr= orignalString.toCharArray();
		
		
		for(int i= chr.length-1; i>=0; i--) {
			
			sb.append(chr[i]);
		}
		
	
		
		return sb.toString();
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to reverse");
		
		String originalString = sc.next();
		
		String result = reverseString(originalString);
		
		System.out.println("Original String is :"+ originalString);
		
		System.out.println("Reversed String is :"+ result);
		sc.close();
//		System.out.println(reverseString("welcome"));
		
		
	
		
		
	}

}
