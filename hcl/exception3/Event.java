package com.hcl.exception3;

public class Event {
String name;
String details;
String ownername;
long typeid;
public Event() {
	// TODO Auto-generated constructor stub
}
public Event(String name, String details, String ownername, long typeid) {
	super();
	this.name = name;
	this.details = details;
	this.ownername = ownername;
	this.typeid = typeid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
}
public long getTypeid() {
	return typeid;
}
public void setTypeid(long typeid) {
	this.typeid = typeid;
}
public void print()
{
	System.out.println(this.name+"\t"+this.details+"\t"+this.ownername+"\t"+this.typeid);
}
}
