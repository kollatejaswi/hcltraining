package com.hcl.java8features;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionLength {

	public static void main(String[] args) {
		String str;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		str=s.nextLine();
        Function <String,Integer> p=st->st.length();
        System.out.println("the length is:"+p.apply(str));
	}

}
