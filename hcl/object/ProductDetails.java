package com.hcl.object;

import java.util.Scanner;

public class ProductDetails {
	public static void main(String[] args) {
		int productcode;
		String productname;
		double price; 
		int stack;
		double j[]=new double[2];
		Scanner s=new Scanner(System.in);
		Product p=new Product();
		System.out.println("product details:");
		for(int i=0;i<2;i++){
			System.out.println("product code:");
			productcode=s.nextInt();
			s.nextLine();
			System.out.println("productname");
			productname=s.nextLine();
			System.out.println("enter price");
			price=s.nextDouble();
			j[i]=price;
			System.out.println("enter no of stock");
			stack=s.nextInt();
			p.setProductcode(productcode);
			p.setProductname(productname);
			p.setPrice(price);
			p.setStack(stack);
		}
		
		
		if(j[0]>j[1])
		{
			System.out.println("mobile is cheaper then tv");
		}
		else
		{
			System.out.println("tv is cheaper then mobile");
		}
	}

}
