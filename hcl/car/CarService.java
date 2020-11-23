package com.hcl.car;

public class CarService implements Service {
int number;
int years;
String brand;
int sum=0;
public CarService() {
	// TODO Auto-generated constructor stub
}
public CarService(int number, int years, String brand) {
	super();
	this.number = number;
	this.years = years;
	this.brand = brand;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getYears() {
	return years;
}
public void setYears(int years) {
	this.years = years;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public void sum()
{
	int nu=this.number;
	while(nu!=0)
	{
		int a=nu%10;
		sum=sum+a;
		nu=nu/10;
	}
	if(sum%2==0)
	{
		System.out.println("you can come on tuesday,thursday or saturday");
	}
	else
	{
		System.out.println("you can come on monday,wenesday or friday");
	}
}
public void year()
{
	int y=this.years;
	if(y>4)
	{
		System.out.println("car wash is not free");
	}
	else
	{
		System.out.println("car wash is free");
	}
}
public void brand()
{
	String c=this.brand;
	String s="maruthi";
	if(c.equals(s))
	{
		System.out.println("your service charges are :4750");
	}
	else
	{
		System.out.println("your service charges are :5000");
	}
}
}
