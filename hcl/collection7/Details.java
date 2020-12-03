package com.hcl.collection7;

public class Details {
			String addressLine1;
			String addressLine2;
			String city;
			String state;
			int pincode;
			public Details() {
				// TODO Auto-generated constructor stub
			}
			public Details(String addressLine1, String addressLine2, String city, String state, int pincode) {
				super();
				this.addressLine1 = addressLine1;
				this.addressLine2 = addressLine2;
				this.city = city;
				this.state = state;
				this.pincode = pincode;
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
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public int getPincode() {
				return pincode;
			}
			public void setPincode(int pincode) {
				this.pincode = pincode;
			}
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return String.format("%s\t%s\t%s\t%s\t%d",addressLine1,addressLine2,city,state,pincode);
			}
			

}
