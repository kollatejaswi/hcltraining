package com.hcl.java8features;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		a=s.nextInt();
		Iface i=no->
		{
			int rev=0,r;
			while(no!=0)
			{
				r=no%10;
				rev=rev*10+r;
				no=no/10;
			}
			return rev;
		};
       System.out.println(" the reverse is:"+i.reverse(a));
	}

}
