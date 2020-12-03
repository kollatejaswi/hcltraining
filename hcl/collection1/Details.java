package com.hcl.collection1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.hcl.arraylist3.Emp;


public class Details {
	public static void main(String[] args) {
	String s1,name;
	int n,price;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number of customers");
	n=s.nextInt();
	s.nextLine();
	String stri[]=new String[n];
	LinkedList emp= new LinkedList<>();
	 for(int i=0;i<n;i++)
	    {
	    	System.out.println("enter the stall"+(i+1));
	    	s1=s.nextLine();
	    	stri[i]=s1;
	     }
		
	for(String a:stri)
    {
		Stall e=new Stall();
		String b[]=a.split(",");
		if(b[0].startsWith("test"))
		{
			
		}
		else
		{
		e.setName(b[0]);
		e.setDetails(b[1]);
		e.setType(b[2]);
		e.setOwnername(b[3]);
		emp.add(e);	
		}
    }
	System.out.println("name"+"\t"+"details"+"\t"+"type"+"\t"+"ownername");
	Iterator itr=emp.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
