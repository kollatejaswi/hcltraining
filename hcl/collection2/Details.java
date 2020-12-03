package com.hcl.collection2;

import com.hcl.collection.Emp;

public class Details implements Comparable {
String name;
String customerNumber;
double costPerday;
String ownerName;
public Details() {
	// TODO Auto-generated constructor stub
}
public Details(String name, String customerNumber, double costPerday, String ownerName) {
	super();
	this.name = name;
	this.customerNumber = customerNumber;
	this.costPerday = costPerday;
	this.ownerName = ownerName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(String customerNumber) {
	this.customerNumber = customerNumber;
}
public double getCostPerday() {
	return costPerday;
}
public void setCostPerday(double costPerday) {
	this.costPerday = costPerday;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
@Override
public int compareTo(Object o) {
	Details e1=(Details)o;
	if(this.costPerday<e1.getCostPerday())
	{
		return -1;
	}
	else if(this.costPerday>e1.getCostPerday())
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
	return String.format("%s\t%s\t%f\t%s",name,customerNumber,costPerday,ownerName);
}

}
