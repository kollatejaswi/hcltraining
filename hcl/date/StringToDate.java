package com.hcl.date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StringToDate {
	public static void main(String[] args) throws ParseException {
		String date;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the date");
		date=s.nextLine();
		SimpleDateFormat s1=new SimpleDateFormat("dd/MM/yyyy");
		Date d=s1.parse(date);
			System.out.println(d);
	}
}
