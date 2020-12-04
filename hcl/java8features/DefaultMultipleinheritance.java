package com.hcl.java8features;
public class DefaultMultipleinheritance implements Left,Right {
	public  void m1()
	{
		Left.super.m1();
	}
	public static void main(String[] args) {
		DefaultMultipleinheritance t= new DefaultMultipleinheritance();
		t.m1();
	}

}
