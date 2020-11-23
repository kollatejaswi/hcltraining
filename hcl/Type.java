package hcl;

import java.util.Scanner;

public class Type {
	public static void main(String s[])
	{
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the extratype details");
		name=sc.nextLine();
		String arr[]=name.split("#");
		System.out.println("extra type details:");
		System.out.println("extra type:"+arr[0]);
		System.out.println("runs:"+arr[1]);
	}

}
