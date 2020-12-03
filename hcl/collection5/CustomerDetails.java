package com.hcl.collection5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class CustomerDetails {

	public static void main(String[] args) {
		String s1,name;
		int n,price;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of users");
		n=s.nextInt();
		s.nextLine();
		String stri[]=new String[n];
		LinkedList<Details> emp= new LinkedList<>();
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println("enter the user"+"\t"+(i+1)+"details");
		    	s1=s.nextLine();
		    	stri[i]=s1;
		     }
			
		for(String a:stri)
	    {
			Details e=new Details();
			String b[]=a.split(",");
			e.setName(b[0]);
			e.setMobileName(b[1]);
			e.setUsername(b[2]);
			e.setPassword(b[3]);
			emp.add(e);
	    }
		Collections.reverse(emp);
		System.out.println("user details in reverse order");
		System.out.println("name"+"\t"+"mobilenumber");
		for(Details e2:emp)
		{
			System.out.println(e2);
		}

	}

}
