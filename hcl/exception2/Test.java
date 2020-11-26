package com.hcl.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try
		{
		  int no;
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter number");
		  no=s.nextInt();
		  System.out.println("the number is:"+no);

	}
		catch(InputMismatchException e)
		{
			System.out.println(e.toString());
		}
	}

}
