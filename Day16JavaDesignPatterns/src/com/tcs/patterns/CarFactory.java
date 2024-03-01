package com.tcs.patterns;

public class CarFactory {
	public static Car makeACar(String brand) {
		if(brand.equals("MahindraThar"))
			return new MahindraThar();
		
		else if(brand.equals("Jeep"))
			return new Jeep();
			
		else
			return null;
	}

}
