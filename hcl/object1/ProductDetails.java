package com.hcl.object1;

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
		Product p1=new Product();
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
			if(i==0)
			{
			p.setProductcode(productcode);
			p.setProductname(productname);
			p.setPrice(price);
			p.setStack(stack);
			p.discount();
			}
			else
			{
				p1.setProductcode(productcode);
				p1.setProductname(productname);
				p1.setPrice(price);
				p1.setStack(stack);
				p1.discount();
			}
			
			
		}
		p.print();
		p1.print();
         p.amount();
	}

}
