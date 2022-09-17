package com.assignment.Q1;

public class Main {

	public static Person generatePerson(Person person)
	{    
		
//	       Person p=null;
		if(person instanceof Student) {
			person=new Student();
			
		}
		else {
			person=new Instructor();
	     }
		
//		p=new Student();
		return person;
	}
	
	
	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);


	}

}
