package com.hcl.object1;

public class Product {
	int productcode;
	String productname;
	double price; 
	int stack,i=0;
	double amount,a1,a2;
	double finalamount;
	double s1[]=new double[2];
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productcode, String productname, double price, int stack) {
		super();
		this.productcode = productcode;
		this.productname = productname;
		this.price = price;
		this.stack = stack;
	}
	public int getProductcode() {
		return productcode;
	}
	public void setProductcode(int productcode) {
		this.productcode = productcode;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStack() {
		return stack;
	}
	public void setStack(int stack) {
		this.stack = stack;
	}
	public void discount()
	{
		amount=this.price;
		a1=amount;
		if(amount>=80000)
		{
			a2=a1*0.8;
			finalamount=amount-a2;
			
		}
		else if(amount>=60000)
		{
			a2=a1*0.2;
			finalamount=amount-a2;
		}
		else if(amount>=50000)
		{
			a2=a1*0.1;
			finalamount=amount-a2;
		}
		else if(amount<50000)
		{
			a2=a1*0.05;
			finalamount=amount-a2;
		}
		s1[i++]=finalamount;
	}
	public void amount()
	{
		if(s1[0]>s1[1])
		{
			System.out.println("mobile is cheaper then tv");
		}
		else
		{
			System.out.println("tv is cheaper then mobile");
		}
	}
	public void print() {
		System.out.println("l&k suppliers");
		System.out.println("product code:"+this.productcode);
		System.out.println("product name:"+this.productname);
		System.out.println("price"+this.price);
		System.out.println("number of stock:"+this.stack);
		System.out.println("discount amount:"+finalamount);
		
		
	}

}
