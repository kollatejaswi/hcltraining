package com.hcl.join;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		 Mythread t=new Mythread();
		 t.start();
		 t.join();
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("main thread");
		 }

	}

}
