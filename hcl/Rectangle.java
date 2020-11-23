package hcl;

public class Rectangle extends Shape {
double length;
double breath;
public Rectangle() {
	// TODO Auto-generated constructor stub
}
public Rectangle(double area,double length, double breath) {
	super(area);
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
public void computerArea()
{
	super.computerArea();
	area=(length*breath);
	System.out.println("area of rectangle is:"+area);
}
}
