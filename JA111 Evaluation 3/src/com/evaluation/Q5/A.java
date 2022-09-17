package com.evaluation.Q5;

public interface A {

	int i = 111;
}
//class B implements A{
//void methodB(){
////i = 222;
//}
//}

// above code will not compile successfully. final field A.i can not assigned.if 
//there should be abstract method so that we can override the function and there 
//should also be constructor in B class so that we can reassign the value of i.