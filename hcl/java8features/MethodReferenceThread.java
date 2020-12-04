package com.hcl.java8features;

public class MethodReferenceThread {
      static void m1()
      {
    	  for(int i=0;i<5;i++)
    	  {
    	   System.out.println("child thread");
    	  }
      }
      public static void main(String[] args) {
    	  Runnable r=MethodReferenceThread::m1;
    	  Thread t=new Thread(r);
    	  t.start();
    	  for(int i=0;i<5;i++)
    	  {
    		  System.out.println("main thread");
    	  }
      }
}
