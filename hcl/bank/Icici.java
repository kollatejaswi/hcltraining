package com.hcl.bank;

public class Icici implements Bank {
	double amount;
	int year;
	int percentage;
	double total=0;
	public Icici() {
		// TODO Auto-generated constructor stub
	}
	
	public Icici(double amount, int year, int percentage) {
		super();
		this.amount = amount;
		this.year = year;
		this.percentage = percentage;
		
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	public void duration()
	{
		total=(amount*percentage*year)/100;
	}
	public void amount()
	{
		System.out.println("ICICI Bank");
		System.out.println("you will have return as "+total+"in"+year+"years");
	}
}
