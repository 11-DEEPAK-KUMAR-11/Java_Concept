package com.Evaluation.Q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList=new ArrayList<>();
	
	int x=0;
	public void addProductToList(Product product)
	{
//		Product product=(Product)product;
		 if(productList.contains(product))
		 {
			  x +=product.count;
			  product.setCount(x);
			  System.out.println("count"+product.getCount());
			 System.out.println("Count updated Product already exists");
		 }
		 else
		 {
			 productList.add(product); 
			 System.out.println("Product added successfully");
		 }
	}
	public List<Product> showAllProduct()
	{
		return this.productList;
	}
}
