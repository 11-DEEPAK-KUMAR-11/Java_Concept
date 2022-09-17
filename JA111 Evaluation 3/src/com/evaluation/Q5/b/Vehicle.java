package com.evaluation.Q5.b;

public interface Vehicle {
    public void run();
    
    public default void service()
    {
    	System.out.println("Car needs service");
    }
}
