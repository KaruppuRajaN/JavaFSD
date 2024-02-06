package com.tcs.exceptions;

public class TestFinally {

	public static void main(String[] args) {
		int d=1;
		System.out.println(d);
		try {
			d=2;
			d=100/1;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(d);
		}
	}

}
