package com.hcl.java8features;
import java.util.Scanner;
import java.util.function.*;
public class PredicateNo {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		Predicate <Integer> p=no->
		{
			if(no>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		System.out.println(p.test(n));

	}

}
