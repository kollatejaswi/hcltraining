package com.hcl.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
		String st=s.format(d);
		System.out.println("formated date"+st);
		SimpleDateFormat s1=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String st1=s1.format(d);
		System.out.println("formated date"+st1);
		

	}

}
