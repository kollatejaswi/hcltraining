package com.hcl.thread.sleep;

public class Mythread extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child thread");
		}
	}

}
