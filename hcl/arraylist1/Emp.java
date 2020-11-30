package com.hcl.arraylist1;

public class Emp {
private String name;
private double deposit;
private double costperday;
public Emp() {
	// TODO Auto-generated constructor stub
}
public Emp(String name, double deposit, double costperday) {
	super();
	this.name = name;
	this.deposit = deposit;
	this.costperday = costperday;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getDeposit() {
	return deposit;
}
public void setDeposit(double deposit) {
	this.deposit = deposit;
}
public double getCostperday() {
	return costperday;
}
public void setCostperday(double costperday) {
	this.costperday = costperday;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("%s\t%f\t%f",name,deposit,costperday);
}

}
