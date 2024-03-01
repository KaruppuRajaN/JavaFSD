package com.tcs.patterns;

public class TestConnetion2 {
public static void main(String[] args) {
	Car a = CarFactory.makeACar("MahindraThar");
	System.out.println(a);
	
	Car b = CarFactory.makeACar("Jeep");
	System.out.println(b);
}
}
