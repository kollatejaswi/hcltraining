package com.hcl.polygon;

public class Square implements Shape {
	double side;
	double area=0;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public Square(double side) {
		super();
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void peri()
	{
		area=4*side;
		System.out.println("perimeter of square:"+area);
	}
	public void area()
	{
		area=side*side;
		System.out.println("area of square:"+area);
	}

}
