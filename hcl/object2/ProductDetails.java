package com.hcl.object2;

import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {
			int productcode,t=0;
			String productname;
			double price; 
			int stack;
			int k[]=new int[4];
			int sta[]=new int[4];
			double j[]=new double[10];
			String s1[]=new String[4];
			Scanner s=new Scanner(System.in);
			Product p=new Product();
			Product p1=new Product();
			Product p2=new Product();
			Product p3=new Product();
			System.out.println("product details:");
			for(int i=0;i<4;i++){
				System.out.println("product code:");
				productcode=s.nextInt();
				s.nextLine();
				System.out.println("productname");
				productname=s.nextLine();
				s1[i]=productname;
				System.out.println("enter price");
				price=s.nextDouble();
				j[i]=price;
				System.out.println("enter no of stock");
				stack=s.nextInt();
				sta[i]=stack;
				if(i==0)
				{
				p.setProductcode(productcode);
				p.setProductname(productname);
				p.setPrice(price);
				p.setStack(stack);
				p.discount();
				k[t++]=p.getStack();
				
				}
				else if(i==1)
				{
					p1.setProductcode(productcode);
					p1.setProductname(productname);
					p1.setPrice(price);
					p1.setStack(stack);
					p1.discount();
					k[t++]=p1.getStack();
					
				}
				else if(i==2)
				{
					p2.setProductcode(productcode);
					p2.setProductname(productname);
					p2.setPrice(price);
					p2.setStack(stack);
					p2.discount();
					k[t++]=p2.getStack();
					
				}
				else
				{
					p3.setProductcode(productcode);
					p3.setProductname(productname);
					p3.setPrice(price);
					p3.setStack(stack);
					p3.discount();
					p3.stack(p3.getStack());
					k[t++]=p3.getStack();
				}
				
			}
			p.print();
			p1.print();
			p2.print();
			p3.print();
		    	for(int v=0;v<4;v++)
		    	{
		    		for(int g=v+1;g<4;g++)
		    		{
		    		if(k[v]>k[g])
		    		{
		    			int s3=k[v];
		    			k[v]=k[g];
		    			k[g]=s3;	
		    			
		    		}
		    	 }
		    	}
		    	  System.out.println("L&k supliers");
		    	  for(int h=0;h<4;h++)
		    	  {
		    		  if(sta[h]==k[0])
		    		  {
		    			  System.out.println("product name:"+s1[h]);
		    		  }
		    	  }
		    	  System.out.println("mimun stack is:"+k[0]);
		    }
		}

	


