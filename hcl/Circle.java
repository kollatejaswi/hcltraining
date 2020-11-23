package hcl;

public class Circle extends Shape {
	double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double area,double radius) {
		super(area);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
public void computerArea()
{
	super.computerArea();
	area=(22/7)*(radius*radius);
	System.out.println("area of circle:"+area);
}
}
