package com.hcl.arraylist4;

public class Emp {
	private int no;
	private String name;
	private long number;
	private int duration;
	private String date;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int no, String name, long number, int duration, String date) {
		super();
		this.no = no;
		this.name = name;
		this.number = number;
		this.duration = duration;
		this.date = date;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int compareTo(Object o)
	{
		Emp e=(Emp)o;
		return -this.name.compareTo(e.getName());
	

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s\t%d\t%d",name,number,duration);
	}
	
}
