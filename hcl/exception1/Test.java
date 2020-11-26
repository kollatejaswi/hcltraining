package com.hcl.exception1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String name;
	     String deposit;
		 String costperdate;
		Driver s1=new Driver();
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter name");
			name=s.nextLine();
			System.out.println("enter deposit");
			deposit=s.nextLine();
			Double j= Double.valueOf(deposit);
			System.out.println("enter cost per day");
			costperdate=s.nextLine();
			Double k=Double.valueOf(costperdate);
			System.out.println("name:"+name);
			System.out.println("deposit:"+j);
			System.out.println("cost per day:"+k);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.toString());
		}

	}

}
