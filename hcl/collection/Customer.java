package com.hcl.collection;

import java.util.*;



public class Customer {

	public static void main(String[] args) {
		String s1,name;
		int n,price;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of customers");
		n=s.nextInt();
		s.nextLine();
		String stri[]=new String[n];
		LinkedList<Emp> emp= new LinkedList<>();
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println("enter the customer"+(i+1));
		    	s1=s.nextLine();
		    	stri[i]=s1;
		     }
			
		for(String a:stri)
	    {
			Emp e=new Emp();
			String b[]=a.split(",");
			e.setCutomerName(b[0]);
			e.setPrice(Integer.valueOf(b[1]));
			emp.add(e);	
	    }
		Collections.sort(emp);
			System.out.println( "minimun cos"+emp.getFirst());
			System.out.println("maximun cost"+emp.getLast());
		}

}
