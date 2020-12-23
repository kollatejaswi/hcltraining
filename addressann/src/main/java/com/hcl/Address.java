package com.hcl;

public class Address {
    private Integer hno;
    private String streetname;
    private String landmark;
    public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(Integer hno, String streetname, String landmark) {
		super();
		this.hno = hno;
		this.streetname = streetname;
		this.landmark = landmark;
	}
	public Integer getHno() {
		return hno;
	}
	public void setHno(Integer hno) {
		this.hno = hno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
    
}
