package com.tcs.ioc;

public class Radius {
	double radius;
	
	public Radius() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public void calculateRadius(int x1, int y1, int x2, int y2) {
		radius=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
	}
	public double getRadius() {
		return radius;
	}
}
