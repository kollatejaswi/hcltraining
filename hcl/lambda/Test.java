package com.hcl.lambda;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a1,b1;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a and b values:");
		a1=s.nextInt();
		b1=s.nextInt();
		Iface i=(a,b)->a+b;
		System.out.println("the sum is:"+ i.add(a1, b1));

	}

}
