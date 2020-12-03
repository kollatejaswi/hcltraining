package com.hcl.collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Customer {

	public static void main(String[] args) {
		String s1,name;
		int n,price;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of halls");
		n=s.nextInt();
		s.nextLine();
		String stri[]=new String[n];
		LinkedList<Details> emp= new LinkedList<>();
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println("enter the hall"+"\t"+(i+1)+"details");
		    	s1=s.nextLine();
		    	stri[i]=s1;
		     }
			
		for(String a:stri)
	    {
			Details e=new Details();
			String b[]=a.split(",");
			e.setName(b[0]);
			e.setCustomerNumber(b[1]);
			e.setCostPerday(Double.valueOf(b[2]));
			e.setOwnerName(b[3]);
			emp.add(e);
	    }
		Collections.sort(emp);
		System.out.println("name"+"\t"+"customername"+"\t"+"costperday"+"\t"+"ownername");
		for(Details e2:emp)
		{
			System.out.println(e2);
		}

	}

}
