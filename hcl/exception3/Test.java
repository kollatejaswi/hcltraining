package com.hcl.exception3;

import java.util.Scanner;

public class Test {
	static long g;
	public static boolean valid(long id)
	{
		Scanner s1=new Scanner(System.in);
		Event e=new Event();
		do
		{
		try
		{
			if(id<=3)
			{
				g=id;
				return true;
			}
			else
			{
				throw new EventDoesNotExist("this event is not present");
			}
		
	   }
	    catch(EventDoesNotExist ex)
			{
	    		System.out.println(ex.getMessage());
	    		System.out.println("enter the correct id");
	            g=s1.nextLong();
	            id=g;
			}
		}while(id>=3);
		return false;
	}
	public static void main(String[] args) {
		String s1;
		int n;
		long id;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of events");
		n=s.nextInt();
		s.nextLine();
		Event e=new Event();
		EventDetails e1=new EventDetails();
		String stri[]=new String[n];
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println("enter the details"+(i+1));
		    	s1=s.nextLine();
		    	stri[i]=s1;
		     }
			System.out.println(" name:"+"\t"+"details"+"\t"+"owner name"+"\t"+"typeid");
			
		for(String a:stri)
	    {
			String b[]=a.split(",");
			e.setName(b[0]);
			e.setDetails(b[1]);
			e.setOwnername(b[2]);
			e1.setId(Long.valueOf(b[3]));
			valid(e1.getId());
			e.setTypeid(g);
			e.print();
	    }
	    }

	}


