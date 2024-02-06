package com.tcs.training;

public class TestTypesVariables {
	public static void main(String args[]) {
		int a=10;
		int b=20;
		int c=0;
		if(a>10)
			c=a-b;
		if(a<10)
			c=a+b;
		boolean result = false == false;
		result = false == result;
		result = !true;
		boolean flag = false;
		if(flag = true) {
			System.out.println(flag);
		}
		a=-10;
		if(a<0)
			System.out.println("Negative");
		else
			System.out.println("Positive");
		int total =1100;
		int subjects =6;
		float avg =(float)total/subjects*2;
		if(avg>=90) 
			System.out.println("A+");
		else if(avg>=80)
			System.out.println("A");
		else if(avg>=70)
			System.out.println("B");
		else if(avg>=50)
			System.out.println("C");
		else
			System.out.println("D");
		
	}
	

}
