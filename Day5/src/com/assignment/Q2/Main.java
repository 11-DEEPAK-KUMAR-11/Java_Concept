package com.assignment.Q2;

public class Main {
      public void checkVowelCons(char ch)
	    {
		// TODO Auto-generated method stub
        //		  char ch = 'i';

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println(ch + " is vowel");
	        else if(ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g'||ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm'||ch == 'n' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's'||ch=='t'|| ch=='v'|| ch=='w'||ch=='x'||ch=='y'||ch=='z')
	            System.out.println(ch + " is consonant");
            
	        else
	        	System.out.println("Error");
	    }
     
	 public static void main(String[] args)
	 {
		 Main d= new Main();
		 d.checkVowelCons('e');
		 d.checkVowelCons('p');
		 d.checkVowelCons('#');
	 }
}
