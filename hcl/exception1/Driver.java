package com.hcl.exception1;

public class Driver {

	String name;
	double deposit;
	double costperdate;
	public Driver() {
		// TODO Auto-generated constructor stub
	}
	public Driver(String name, double deposit, double costperdate) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costperdate = costperdate;
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
	public double getCostperdate() {
		return costperdate;
	}
	public void setCostperdate(double costperdate) {
		this.costperdate = costperdate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s\t%d\t%d",name,deposit,costperdate);
	}
	
}
