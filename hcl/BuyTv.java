package hcl;

import java.util.Scanner;

public class BuyTv {
	public static void main(String[] args) {
		 String name;
		 String details;
	     String ownerName;
		 String type;
		 int feet;
		 char choice;
		 int tvno;
		 int cost;
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the name of the stall");
		 name=s.nextLine();
		 System.out.println("enter the details of stall");
		 details=s.nextLine();
		 System.out.println("enter owner name");
		 ownerName=s.nextLine();
		 System.out.println("enter the type");
		 type=s.nextLine();
		 System.out.println("enter the feets");
		 feet=s.nextInt();
		 s.nextLine();
		 System.out.println("do you have tv");
		 choice=s.next().charAt(0);
		 System.out.println("enter no of tv");
		 tvno=s.nextInt();
		 if(choice=='y')
		 {
		 Tv t=new Tv(type,feet,tvno);
		 t.with(type,feet,tvno);
		 }
		 else
		 {
			 Tv t1=new Tv(type,feet);
			 t1.without(type, feet);
		 }

	}

}
