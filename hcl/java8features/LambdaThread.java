package com.hcl.java8features;

public class LambdaThread {

	public static void main(String[] args) {
		new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("child thread");
			}
		}).start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
      
	}

}
