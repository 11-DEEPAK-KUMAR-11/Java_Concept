package com.evaluation.Q3;

public class Main {

	
	 public void messageToStudents(Evaluation evaluation)
     {
   	   if(evaluation instanceof DsaEvaluation)
   	   {
   		   System.out.println("Its a DSA evaluation");
   		   evaluation.printNoOfQuestions();
   		   evaluation.evaluationTiming();
   		   
   		   System.out.println("==================");
   	   }
   	   
   	   else 
   	   {
   		System.out.println("Its a Coding evaluation");
		   evaluation.printNoOfQuestions();
		   evaluation.evaluationTiming();
		   
		   System.out.println("==================");  
   	   }
     }

	public static void main(String[] args) {

		Main ma=new Main();
		ma.messageToStudents(new DsaEvaluation(5));
		ma.messageToStudents(new CodingEvaluation(4));

	}

}
