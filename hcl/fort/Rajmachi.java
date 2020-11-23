package com.hcl.fort;

public class Rajmachi implements Fort {
	String name="rajmachi";
	int distance=55;
	public Rajmachi() {
		// TODO Auto-generated constructor stub
	}
	public Rajmachi(String name, int distance) {
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
