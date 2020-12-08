package com.hcl.runnable;

public class Mythread implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread");
		}
	}

}
