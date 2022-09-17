package com.evaluation.Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String => ");
        String str=sc.next();
        
        System.out.println("Enter Position => ");
        int p=sc.nextInt();
        
        char[] ch = new char[str.length()];
        
        
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

//        for (char c : ch) {
//            System.out.println(c);
//        }
        
        for(int i=0;i<ch.length;i++)
        {
        	if((i)==p)
        	{
        		System.out.println(ch[i]);
        		break;
        	}
        	
        	else if(p>ch.length)
        	{
        		System.out.println("Invalid position, Please enter a valid position =>");
        		break;
        	}
        }
        
        sc.close();
	}

}
