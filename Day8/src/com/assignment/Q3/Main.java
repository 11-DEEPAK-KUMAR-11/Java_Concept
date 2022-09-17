//write the logic to iterate through the supplied inputArray and return array of prime
		//numbers
		//if no prime number is found then return the empty array.
		

package com.assignment.Q3;

public class Main {

	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		 //determines the size of the array returned
	    int primeTotal = 0;

	    //loop to find total prime numbers
	    for (int j = 0; j <inputArray.length; j ++)
	    {
	        if (isPrime(inputArray[j]))
	        primeTotal +=1;
	    }

	    //declare array to be returned
	    int[] numA = new int[primeTotal];

	    //current index of prime number
	    int P = 0;

	    //loop to add prime elements to array
	    for (int x = 0; x <inputArray.length; x++)
	    {
	        if (isPrime(inputArray[x]))
	        {
	            numA[P]=inputArray[x];
	            P++;   
      	
//	        	System.out.println(inputArray[x]);
	        }

	    }

	    return numA;
	}
	
	public static boolean isPrime(int n) {

	   for (int i = 2; i < n; i++) {
	        if(n % i == 0)
	            return false;
	    }

	    if (n < 2) return false;

	    return true;
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,12,5,50,11,14,15};
		Main d1=new Main();
		
		int[] arr1=d1.findAndReturnPrimeNumbers(arr);
		 for(int i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr1[i]);
		 }
			 
			 
			 
			 
			 
			 
			 
			 
	}

	
	
	
	
	
	
	
	
	
}
