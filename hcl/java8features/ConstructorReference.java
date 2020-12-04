package com.hcl.java8features;

import java.util.Scanner;

public class ConstructorReference {

	public static void main(String[] args) {
		String str;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		str=s.nextLine();
		Over o= Sample::new;
		o.Get(str); 

	}

}
