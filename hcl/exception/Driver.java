package com.hcl.exception;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int cost;
		int n;
		int k;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the cost");
		cost=s.nextInt();
		System.out.println("enter n");
		n=s.nextInt();
		try
		{
		    k=cost/n;
		    System.out.println("cost per day:"+k);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}

	}

}
