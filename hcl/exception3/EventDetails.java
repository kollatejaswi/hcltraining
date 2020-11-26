package com.hcl.exception3;

import java.util.Scanner;

public class EventDetails {
long id;long g;
String name;
public EventDetails() {
	// TODO Auto-generated constructor stub
}
public EventDetails(long id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
Scanner s=new Scanner(System.in);
Event e= new Event();

}