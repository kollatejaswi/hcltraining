package com.hcl.collection6;


public class Details implements Comparable {
	 String name;
	 String email;
	 String username;
	 String password;
	 public Details() {
		// TODO Auto-generated constructor stub
	}
	public Details(String name, String email, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public int compareTo(Object o) {
		Details d=(Details)o;
		return this.name.compareTo(d.getName());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s\t%s\t%s\t%s",name,email,username,password);
	}
}