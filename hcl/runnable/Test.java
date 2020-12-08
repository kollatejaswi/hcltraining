package com.hcl.runnable;


public class Test {

	public static void main(String[] args) {
		Runnable r=new Mythread();
		Thread t=new Thread(r);
		 t.start();
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("main thread");
		 }

	}

}
