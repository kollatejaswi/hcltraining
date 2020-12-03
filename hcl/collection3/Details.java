package com.hcl.collection3;

public class Details implements Comparable {
String userNmae;
String addressLine1;
String addressLine2;
int pincode;
public Details() {
	// TODO Auto-generated constructor stub
}
public Details(String userNmae, String addressLine1, String addressLine2, int pincode) {
	super();
	this.userNmae = userNmae;
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
	this.pincode = pincode;
}
public String getUserNmae() {
	return userNmae;
}
public void setUserNmae(String userNmae) {
	this.userNmae = userNmae;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public int compareTo(Object o) {
	Details d=(Details)o;
	// TODO Auto-generated method stub
	return -this.userNmae.compareTo(d.getUserNmae());
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("%s\t%s\t%s\t%d",userNmae,addressLine1,addressLine2,pincode);
}

}
