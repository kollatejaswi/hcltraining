package hcl;

import java.util.Scanner;

class Deliver
	{
	     Long over;
	     Long ball;
	     Long run;
          String batsman;
		   String blower;
	      String nonStriker;
		public void init(Long o,Long bl,Long r,String ba,String b,String n)
		{
			over=o;
			ball=bl;
			run=r;
			batsman=ba;
			blower=b;
			nonStriker=n;
		}
		public void display()
		{
			System.out.println("delivery details:");
			System.out.println("over:"+over);
			System.out.println("ball:"+ball);
			System.out.println("run:"+run);
			System.out.println("batsman:"+batsman);
			System.out.println("blower:"+blower);
			System.out.println("nonstricker:"+nonStriker);
		}
	}
	class Sam
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
			Deliver d=new Deliver();
			d.init(over,ball,run,batsman,blower,nonStriker );
			d.display();
			
		}
	}

