package hcl;

public class Triangle extends Shape {
	double base;
	double height;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(double area,double base, double height) {
		super(area);
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void computerArea()
	{
		super.computerArea();
		area=(0.5)*(base*height);
		System.out.println("area of triangle:"+area);
	}
}
