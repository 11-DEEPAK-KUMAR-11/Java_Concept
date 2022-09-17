//Question-3
package com.evaluationQue1to3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 64;
		int b = 70;
		byte c = (byte) (a+b);   //typecast (a+b) to byte
		System.out.println(c);
	}

}
// here we have to apply the explicit typecasting or downcasting to store the big data type into
// its equivalent smaller data type . then we can store the big data type into smaller data type
// to do so we have to use Prefix like -: (byte)(a+b);