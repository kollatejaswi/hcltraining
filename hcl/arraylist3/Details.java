package com.hcl.arraylist3;

import java.util.*;


public class Details {

	public static void main(String[] args) {
		String name;
		String contactno;
		String username;
		String emailid;
		String str;
		int no;
		Scanner sc=new Scanner(System.in);
	    Emp e=new Emp();
	    List<Emp> em=new LinkedList<Emp>();
	    for(int i=0;i<4;i++)
	    {
	    	System.out.println("enter the name");
	    	name=sc.nextLine();
	        contactno=sc.nextLine();
	        username=sc.nextLine();
	        emailid=sc.nextLine();
	        em.add(new Emp(name,contactno,username,emailid));
	    	
	    }
	    for(Emp e7:em)
	    {
	    	System.out.println(e7);
	    }
	    System.out.println("enter the number of details ");
	    no=sc.nextInt();
	    sc.nextLine();
	    String stri[]=new String[no];
	    for(int i=0;i<no;i++)
	    {
	    	System.out.println("enter the details to add"+(i+1));
	    	str=sc.nextLine();
	    	stri[i]=str;
	     }
	    for(String a:stri)
	    {
	    	String[] b= a.split(",");
	    	e.setName(b[0]);
	    	e.setContactno(b[1]);
	    	e.setUsername(b[2]);
	    	e.setEmailid(b[3]);
            em.add(e);
	    	
	    }
	    System.out.println("name\t"+"contactno\t"+"username\t"+"emailid");
		for(Emp e1:em)
		{
			System.out.println(e1);
		}
		System.out.println("enter starting index and ending index");
		int startindex=sc.nextInt();
		int endindex=sc.nextInt();
		sc.nextLine();
	    em.subList(startindex,endindex).clear();
	    for(Emp employee:em)
	    {
	    	System.out.println(employee);
	    }


	}

}
