package hcl;

import java.util.Scanner;

public class Ball {

	public static void main(String[] args) {
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
		Delivered d= new Delivered();
		d.setOver(over);
		d.setBall(ball);
		d.setRun(run);
		d.setBatsman(batsman);
		d.setBlower(blower);
		d.setNonStriker(nonStriker);
		System.out.println("over:"+over);
		System.out.println("ball:"+ball);
		System.out.println("run:"+run);
		System.out.println("batsman:"+batsman);
		System.out.println("blower:"+blower);
		System.out.println("nonstricker:"+nonStriker);

	}

}
