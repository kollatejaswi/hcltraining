package hcl;

import java.util.Scanner;

public class AreaCal {

	public static void main(String[] args) {
		double length;
		double breath;
		double radius;
		double base;
		double height;
		int choice;
		Triangle t= new Triangle();
		Circle c= new Circle();
		Rectangle r= new Rectangle();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the shape");
		System.out.println("1.circle");
		System.out.println("2.rectangle");
		System.out.println("3.triangle");
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter the radius");
			radius=s.nextDouble();
			c.setRadius(radius);
			c.computerArea();
			break;
		case 2:
			System.out.println("enter length and breath");
			length=s.nextDouble();
			breath=s.nextDouble();
			r.setLength(length);
			r.setBreath(breath);
			r.computerArea();
			break;
		case 3:
			System.out.println("enter base and heigth");
			base=s.nextDouble();
			height=s.nextDouble();
			t.setBase(base);
			t.setHeight(height);
			t.computerArea();
			break;
		}

	}

}
