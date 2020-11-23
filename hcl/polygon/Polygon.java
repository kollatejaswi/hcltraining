package com.hcl.polygon;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		double side,length,breath;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the length and breath");
		length=s.nextDouble();
		breath=s.nextDouble();
		System.out.println("enter the side");
		side=s.nextDouble();
		Shape r= new Rectangle(length,breath);
		r.peri();
		r.area();
		Shape sh=new Square(side);
		sh.peri();
		sh.area();

	}

}
