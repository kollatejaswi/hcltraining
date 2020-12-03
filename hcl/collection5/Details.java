package com.hcl.collection5;

public class Details {
String name;
String mobileName;
String username;
String password;
public Details() {
	// TODO Auto-generated constructor stub
}
public Details(String name, String mobileName, String username, String password) {
	super();
	this.name = name;
	this.mobileName = mobileName;
	this.username = username;
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("%s\t%s",name,mobileName);
}

}
