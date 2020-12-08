package com.hcl.thread1;

public class Mythread extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread");
		}
	}
	public void start()
	{
		System.out.println("start method");
	}

}
