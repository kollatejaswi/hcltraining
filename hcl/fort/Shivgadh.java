package com.hcl.fort;

public class Shivgadh implements Fort{
	String name="shivgadh";
	int distance=100;
	public Shivgadh() {
		// TODO Auto-generated constructor stub
	}
	public Shivgadh(String name, int distance) {
		super();
		this.name = name;
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public void distance()
	{
		System.out.println("you are going to visit "+this.name);
		System.out.println("distance is "+this.distance+"km");
	}
}
