package com.hcl.domain;

public class Product {
  private int productid;
  private String productname;
  private String imageurl;
  private String description;
  private int price;
  public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int productid, String productname, String imageurl, String description, int price) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.imageurl = imageurl;
	this.description = description;
	this.price = price;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getImageurl() {
	return imageurl;
}
public void setImageurl(String imageurl) {
	this.imageurl = imageurl;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
  
}
