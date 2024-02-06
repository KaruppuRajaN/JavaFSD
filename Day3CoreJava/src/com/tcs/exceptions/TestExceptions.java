package com.tcs.exceptions;

import java.io.FileInputStream;

public class TestExceptions {

	public static void main(String[] args) {
		try {
			int div=100/0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		catch(ArithmeticException e) {
//			System.out.println(e.toString());
//		}
		finally {
			System.out.println("Hi! This is finally!");
		}
	}

}
