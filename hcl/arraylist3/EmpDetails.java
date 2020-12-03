package com.hcl.arraylist3;
import java.util.*;
public class EmpDetails {

	public static void main(String[] args) {
		String name;
		String contactno;
		String username;
		String emailid;
		String str;
		int no,startindex,endindex;
		String st[]=new String[100];
		String b[]=new String[100];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of user you want to add");
		no=s.nextInt();
		s.nextLine();
		LinkedList<Emp> em=new LinkedList<Emp>();
		 for(int i=0;i<no;i++)
		    {
		    	str=s.nextLine();
		    	st[i]=str;
		     }
		    for(String a:st)
		    {
			Emp e=new Emp();
		    	b= a.split(",");
		    	e.setName(b[0]);
		    	e.setContactno(b[1]);
		    	e.setUsername(b[2]);;
		    	e.setEmailid(b[3]);
		    	em.add(e);
		    }
		System.out.println("name\t"+"contactno\t"+"username\t"+"emailid");
		Iterator<Emp>itr=em.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("enter starting index and ending index");
		startindex=s.nextInt();
		endindex=s.nextInt();
		s.nextLine();
	    em.subList(startindex,endindex);
	    for(Emp employee:em)
	    {
	    	System.out.println(employee);
	    }

	}

}
