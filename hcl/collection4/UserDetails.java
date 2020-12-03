package com.hcl.collection4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class UserDetails {

	public static void main(String[] args) {
		String s1,name;
		int n,price;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of users");
		n=s.nextInt();
		s.nextLine();
		String stri[]=new String[n];
		LinkedList<Details> emp= new LinkedList<>();
		LinkedList<Details1> emp1= new LinkedList<>();
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println("enter the user"+"\t"+(i+1)+"details");
		    	s1=s.nextLine();
		    	stri[i]=s1;
		     }
			System.out.println("sort by");
			System.out.println("1.name");
			System.out.println("2.email");
			n=s.nextInt();
			s.nextLine();
			switch(n)
			{
			
			case 1:
					for(String a:stri)
				    {
						Details e=new Details();
						String b[]=a.split(",");
						e.setName(b[0]);
						e.setEmail(b[1]);
						e.setUsername(b[2]);
						e.setPassword(b[3]);
						emp.add(e);
				    }
					Collections.sort(emp);
					System.out.println("user details");
					for(Details e2:emp)
					{
						System.out.println(e2);
					}
					break;
			case 2:
				for(String a:stri)
			    {
					Details1 e=new Details1();
					String b[]=a.split(",");
					e.setName(b[0]);
					e.setEmail(b[1]);
					e.setUsername(b[2]);
					e.setPassword(b[3]);
					emp1.add(e);
			    }
				Collections.sort(emp1);
				System.out.println("user details");
				for(Details1 e2:emp1)
				{
					System.out.println(e2);
				}
				break;
			}
	}

}
