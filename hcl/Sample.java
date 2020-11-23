package hcl;

import java.util.Scanner;
class Delivery
{
	  Long over;
	  Long ball;
	  Long run;
      String batsman;
      String blower;
      String nonStriker;
	Delivery(Long over,Long ball,Long run,String batsman,String blower,String nonStriker)
	{
		this.over=over;
		this.ball=ball;
		this.run=run;
		this.batsman=batsman;
		this.blower=blower;
		this.nonStriker=nonStriker;
	}
}
class Sample
{
	public static void main(String s[])
	{
		Long over;
		  Long ball;
		  Long run;
	      String batsman;
	      String blower;
	      String nonStriker;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the over");
		over=sc.nextLong();
		System.out.println("enter the ball");
		ball=sc.nextLong();
		System.out.println("enter the run");
		run=sc.nextLong();
		sc.nextLine();
		System.out.println("enter the batsman");
		batsman=sc.nextLine();
		System.out.println("enter the blower");
		blower=sc.nextLine();
		System.out.println("enter the nonStriker");
		nonStriker=sc.nextLine();
		Delivery v= new Delivery(over,ball,run,batsman,blower,nonStriker);
		System.out.println("delivery details:");
		System.out.println("over:"+v.over);
		System.out.println("ball:"+v.ball);
		System.out.println("run:"+v.run);
		System.out.println("batsman:"+v.batsman);
		System.out.println("blower:"+v.blower);
		System.out.println("nonstricker:"+v.nonStriker);
	}
}
