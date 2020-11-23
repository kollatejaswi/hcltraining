package com.hcl.inter.stall;

public class PremiunStall implements Stall {
	private String stallName;
    private int cost;
     private String ownerName;
     private int projector;
     public PremiunStall() {
		// TODO Auto-generated constructor stub
	}
	public PremiunStall(String stallName, int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
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
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	public void display()
	 {
		 System.out.println("stall name:"+this.stallName);
		 System.out.println("cost:"+this.cost);
		 System.out.println("owner name:"+this.ownerName);
		 System.out.println("projector:"+this.projector);
	 }
}
