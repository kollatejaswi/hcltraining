package com.hcl.collection;

public class Emp implements Comparable{
String cutomerName;
int price;
public Emp() {
	// TODO Auto-generated constructor stub
}
public Emp(String cutomerName, int price) {
	super();
	this.cutomerName = cutomerName;
	this.price = price;
}
public String getCutomerName() {
	return cutomerName;
}
public void setCutomerName(String cutomerName) {
	this.cutomerName = cutomerName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int compareTo(Object o)
{
	Emp e1=(Emp)o;
	if(this.price<e1.getPrice())
	{
		return -1;
	}
	else if(this.price>e1.getPrice())
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("%s\t%d",cutomerName,price);
}

}
