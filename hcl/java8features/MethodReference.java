package com.hcl.java8features;

import java.util.Scanner;

public class MethodReference {
	      
	       static void m1(int a)
	       {
	    	   System.out.println("method reference"+a);
	       }
      
			public static void main(String[] args) {
				int n;
				Scanner s= new Scanner(System.in);
				System.out.println("enter the number");
				n=s.nextInt();
				Method m=MethodReference::m1;
				m.m2(n);
                		
			}

}
