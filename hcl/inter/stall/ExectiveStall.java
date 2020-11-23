package com.hcl.inter.stall;

public class ExectiveStall implements Stall {
	private String stallName;
    private int cost;
     private String ownerName;
     private int screen;
public ExectiveStall() {
	// TODO Auto-generated constructor stub
}
public ExectiveStall(String stallName, int cost, String ownerName, int screen) {
	super();
	this.stallName = stallName;
	this.cost = cost;
	this.ownerName = ownerName;
	this.screen = screen;
}
public String getStallName() {
	return stallName;
}
public void setStallName(String stallName) {
	this.stallName = stallName;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public int getScreen() {
	return screen;
}
public void setScreen(int screen) {
	this.screen = screen;
}
public void display()
{
	 System.out.println("stall name:"+this.stallName);
	 System.out.println("cost:"+this.cost);
	 System.out.println("owner name:"+this.ownerName);
	 System.out.println("screen:"+this.screen);
}
}
