package com.hcl.collection7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class CustomerDetails {

	public static void main(String[] args) {
		String s1,name;
		int n,price;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of users");
		n=s.nextInt();
		s.nextLine();
		String stri[]=new String[n];
	    List<Details> emp= new ArrayList<>();
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
			e.setAddressLine1(b[0]);
			e.setAddressLine2(b[1]);
			e.setCity(b[2]);
			e.setState(b[3]);
			e.setPincode(Integer.valueOf(b[4]));
			emp.add(e);
	    }
		System.out.println("enter the city you want to search");
		String sr=s.nextLine();
		System.out.println("enter the state to search");
		String sr1=s.nextLine();
			    for(Details d:emp)
			    {
			    	if(d.getCity().equals(sr)&&d.getState().equals(sr1))
			    	{
			    		System.out.println(d);
			    	}
			    }
			   

	}

}
