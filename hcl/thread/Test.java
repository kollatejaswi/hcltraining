package com.hcl.thread;

public class Test {

	public static void main(String[] args) {
	 Mythread t=new Mythread();
	 t.start();
	 for(int i=0;i<5;i++)
	 {
		 System.out.println("main thread");
	 }
	}

}
