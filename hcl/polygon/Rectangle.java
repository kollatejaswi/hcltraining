package com.hcl.polygon;

public class Rectangle implements Shape {
	double length,breath;
	double area=0;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	
public void peri()
{
	area=2*(length+breath);
	System.out.println("perimeter of rectangle:"+area);
}
public void area()
{
	area=length*breath;
	System.out.println("area of rectangle:"+area);
}
}
