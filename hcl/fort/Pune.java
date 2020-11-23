package com.hcl.fort;

import java.util.Scanner;

public class Pune {

	public static void main(String[] args) {
		int choice;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the choice");
	     System.out.println("1.Ramachi");
	     System.out.println("2.Shivgadh");
	     System.out.println("3.Murud");
	     choice=s.nextInt();
	     s.nextLine();
	     Fort r=new Rajmachi();
	     Fort sh= new Shivgadh();
	     Fort m= new Murud();
	     switch(choice)
	     {
	     case 1:
	    	 r.distance();
	    	 break;
	     case 2:
	    	 sh.distance();
	    	 break;
	     case 3:
	    	 m.distance();
	    	 break;
	     }

	}

}
