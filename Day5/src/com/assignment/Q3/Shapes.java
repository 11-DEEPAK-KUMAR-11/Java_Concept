package com.assignment.Q3;

public class Shapes {

	  public void area(Circle c)
	  {   
         
		     
		  double area=(c.radius*c.radius)*Math.PI;
		  System.out.println("Area of the circle is : "+area+ " centimeter square");
	  }
	  
	  
	  public void area(Rectangle c)
	  {   
         
		   double area=c.length*c.breath;
		   System.out.println("Area of Rectangle is : "+area+" meter square");
	  }
	  
	  public void area(Square c)
	  {   
         
		   double area=c.side*c.side;
		   System.out.println("Area of Square is : "+area+" meter square");
	  }
	  
	  
//	  public static void main(String[] args) {
//	
//		
//		Shapes sol=new Shapes();
//		sol.area(new Circle());
//		
//		sol.area(new Rectangle());
//		
//		sol.area(new Square());
//		
//		
//	}

}
