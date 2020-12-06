package com.hcl.date;

import java.util.*;

public class DateChecking {

	public static void main(String[] args) {
		int year,month,day;
		Scanner s=new Scanner(System.in);
		System.out.println("enter year month and day");
		year=s.nextInt();
		month=s.nextInt();
		day=s.nextInt();
		Date d=new Date(year,month,day);
		Date d1=new Date();
		Date d2=new Date(2010,12,21);
		boolean b=d1.after(d);
		System.out.println(b);
		boolean b2=d.before(d2);
		System.out.println(b2);
		int a=d.compareTo(d1);
		System.out.println(a);
		System.out.println("befor setting"+d1);
		d1.setTime(456789098765L);
		System.out.println("after setting time"+d1);
		int di=d1.hashCode();
		System.out.println("hash code is"+di);
		Object clone=d1.clone();
		System.out.println("clone object"+clone);
		boolean boo=d.equals(d2);
		System.out.println(boo);
			

	}

}
