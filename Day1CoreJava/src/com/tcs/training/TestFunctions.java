package com.tcs.training;

public class TestFunctions {

	public static void validate(float a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		validate(a); //Conversion Context - Implicit conversion takes place(to Widening Range)
		
		short s=10;
		//short sum =  s+s; //Throws error - Minimum integer - So result is integer
		//byte + byte = int
		//short+ short = int
		//int + long =long
		//float + long = float
		//Not only addition including Division and Multiplication
		//Type, Order and No.Of Parameters should be unique - Function Overloading

	}

}
