package com.hcl.car;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		int number;
		int years;
		String brand;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the car number");
		number=s.nextInt();
		System.out.println("how many years old car do you have");
		years=s.nextInt();
		s.nextLine();
		System.out.println("car brand");
		brand=s.nextLine();
		Service cs=new CarService(number,years,brand);
		cs.sum();
		cs.year();
		cs.brand();

	}

}
