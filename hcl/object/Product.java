package com.hcl.object;

public class Product {
	int productcode;
	String productname;
	double price; 
	int stack;
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
	
	

}
