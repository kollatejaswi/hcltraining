package com.hcl.collection8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Tickets {

	public static void main(String[] args) {
		String s1,name;
		int n,price;
		char id;
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
	    ArrayList<ArrayList<Integer>>emp= new ArrayList<ArrayList<Integer>>(5);
		ArrayList<Integer>a1=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			System.out.println("on day"+"\t"+(i+1)+"details");
	    	s1=s.nextLine();
	    	String stri[]=s1.split(",");
	    	for(int j=0;j<4;j++)
	    	{
	    		a1.add(100-Integer.valueOf(stri[j]));
	    	}
	    	emp.add(a1);
		}
		do
		{
			System.out.println("enter the day u want to the details");
			int ch=s.nextInt();
		    s.nextLine();
		    System.out.println("remaining tickets"+emp.get(ch-1));
			
			System.out.println("do u want to continue");
			id=s.next().charAt(0);
		}while(id=='y');
	}

}
