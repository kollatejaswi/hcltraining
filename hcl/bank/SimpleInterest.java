package com.hcl.bank;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		double amount,a1,a2,a3;
		int year;
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount you want to invest");
		amount=s.nextDouble();
		System.out.println("enter the years");
		year=s.nextInt();
		Axis a=new Axis();
		Hdfc h= new Hdfc();
		Icici i= new Icici();
		a.setAmount(amount);
		a.setPercentage(56);
		a.setYear(year);
		h.setAmount(amount);
		h.setYear(year);
		h.setPercentage(49);
		i.setAmount(amount);
		i.setYear(year);
		i.setPercentage(60);
		a1=a.getTotal();
		a2=h.getTotal();
		a3=i.getTotal();
		if((a1>a2)&&(a1>a3))
		{
			a.duration();
			a.amount();
		}
		else if(a2>a3){
			h.duration();
			h.amount();
		}
		else
		{
			i.duration();
			i.amount();
		}

	}

}
