package com.hcl.thread.yield;

public class Mythread extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("child thread");
		}
	}

}
