package com.hcl.collection6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class UserDetails  {

	public static void main(String[] args) {
		String s1,name;
		int n,price;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of users");
		n=s.nextInt();
		s.nextLine();
		String stri[]=new String[n];
	    TreeSet<Details> emp= new TreeSet<>(new CustomerName());
		Details e=null;
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println("enter the user"+"\t"+(i+1)+"details");
		    	s1=s.nextLine();
		    	stri[i]=s1;
		     }
			
		for(String a:stri)
	    {
			 e=new Details();
			String b[]=a.split(",");
			e.setName(b[0]);
			e.setEmail(b[1]);
			e.setUsername(b[2]);
			e.setPassword(b[3]);
			emp.add(e);
	    }
		System.out.println("search by:");
		System.out.println("1.name");
		System.out.println("2.email");
		int ch=s.nextInt();
		s.nextLine();
		System.out.println("enter the name you want to search");
		String sr=s.nextLine();
		switch(ch)
		{
		case 1:
			    for(Details d:emp)
			    {
			    	if(d.getName().equals(sr))
			    	{
			    		System.out.println(d);
			    	}
			    }
			    break;
		case 2:
				for(Details d:emp)
			    {
			    	if(d.getEmail().equals(sr))
			    	{
			    		System.out.println(d);
			    	}
			    }
			    break;
		}
	}

}
