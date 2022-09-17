package com.evaluation.Q1;

public class Main {

	
	public static void main(String[] args) {
		
		Student st=new Student(23, "rakesh", 450);
		
		Employee emp=new Employee(12, "Lokesh", 84000);
		int[][]  array=new int[4][4];
		
		array[0][0]= st.getRoll();
//		array[0][1]=st.getName();
		array[0][2]=st.getMarks();
	}

}
