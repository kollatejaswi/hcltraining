package com.hcl.synchronization;

public class Demo {

	public static void main(String[] args) {
		Display d1=new Display();
		Mythread t1=new Mythread(d1,"dhoni");
		Mythread t2=new Mythread(d1,"yuvaraj");
		t1.start();
		t2.start();

	}

}
