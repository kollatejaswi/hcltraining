package com.hcl;


public class Emp {
   private Integer eno;
   private String name;
   private Address address;
   public Emp() {
	// TODO Auto-generated constructor stub
}
public Emp(Integer eno, String name, Address address) {
	super();
	this.eno = eno;
	this.name = name;
	this.address = address;
}
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
   
}
