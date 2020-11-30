package com.hcl.arraylist2;

import java.util.*;

public class HallDetails {
	public static void main(String[] args)
	{
		
		String hallId,search;
		int no;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of halls");
		no=s.nextInt();
		s.nextLine();
		List<Emp> e= new ArrayList<>();
		Emp em=new Emp();
		for(int i=0;i<no;i++)
		{
			System.out.println("enter hall"+(i+1));
			hallId=s.nextLine();
			e.add(new Emp(hallId));
			
		}
		System.out.println("enter the search element");
		search=s.nextLine();
		Emp emp=null;
		int i=0;
		for(Emp e1:e)
		{
			if(e1.getHallId().equals(search))
			{
				i=1;
				System.out.println(search+"is found at"+e.indexOf(e1));
			}
		}
		if(i==0)
		{
			System.out.println(search+" is not found");
		}

}
}
