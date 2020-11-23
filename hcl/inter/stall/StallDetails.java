package com.hcl.inter.stall;

import java.util.Scanner;

public class StallDetails {
	public static void main(String[] args)
	{
	 String stallName;
      int cost;
      String ownerName;
      int screen;
      int projector;
      int  tvSet;
      int choice;
      String details;
     Scanner s =new Scanner(System.in);
     GoldenStall st= new GoldenStall();
     PremiunStall st1=new PremiunStall();
     ExectiveStall st2= new ExectiveStall();
     System.out.println("enter the choice");
     System.out.println("1.golden stall");
     System.out.println("2.premiun stall");
     System.out.println("3.exective stall");
     choice=s.nextInt();
     s.nextLine();
     switch(choice)
     {
     case 1:
    	 System.out.println("enter the details");
    	 details=s.nextLine();
    	 String str[]=details.split(",");
    	st.setStallName(str[0]);
    	st.setCost(Integer.valueOf(str[1]));
    	st.setOwnerName(str[2]);
    	st.setTvSet(Integer.valueOf(str[3]));
    	st.display();
    	break;
     case 2:
    	 System.out.println("enter the details");
    	 details=s.nextLine();
    	 String str1[]=details.split(",");
     	 st1.setStallName(str1[0]);
     	 st1.setCost(Integer.valueOf(str1[1]));
     	 st1.setOwnerName(str1[2]);
     	 st1.setProjector(Integer.valueOf(str1[3]));
     	 st1.display();
     	break;
     case 3:
    	 System.out.println("enter the details");
    	 details=s.nextLine();
    	 String str3[]=details.split(",");
     	 st2.setStallName(str3[0]);
     	 st2.setCost(Integer.valueOf(str3[1]));
     	 st2.setOwnerName(str3[2]);
     	 st2.setScreen(Integer.valueOf(str3[3]));
     	 st2.display();
     	 break;
     }
	}
}
