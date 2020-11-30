package com.hcl.arraylist3;

public class Emp {
String name;
String contactno;
String username;
String emailid;
public Emp() {
	// TODO Auto-generated constructor stub
}
public Emp(String name, String contactno, String username, String emailid) {
	super();
	this.name = name;
	this.contactno = contactno;
	this.username = username;
	this.emailid = emailid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("%s\t%s\t%s\t%s",name,contactno,username,emailid);
}

}
