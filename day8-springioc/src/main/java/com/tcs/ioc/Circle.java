package com.tcs.ioc;

public class Circle {
	Radius r;
	public void setRadius(Radius r) {
		this.r=r;
	}
	public void calculateArea(int x1,int x2,int y1,int y2) {
		r.calculateRadius(x1, y1, x2, y2);
		double rad = r.getRadius();
		double area = Math.PI*rad*rad;
		System.out.println("Radius - "+rad);
		System.out.print("Area - "+area);
		
		
		
	}

}
