package com.hcl.java8features;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateLength {

	public static void main(String[] args) {
		String str;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		str=s.nextLine();
		Predicate <String> p=st->st.length()>4;
        System.out.println(p.test(str));
	}

}
