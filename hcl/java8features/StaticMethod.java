package com.hcl.java8features;

import java.util.Scanner;

public class StaticMethod implements Istatic {

	public static void main(String[] args) {
		int a1,b1;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a and b values:");
		a1=s.nextInt();
		b1=s.nextInt();
		Istatic.m1(a1, b1);

	}

}
