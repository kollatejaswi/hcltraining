package hcl;

import java.util.*;
class Venue
{
      String name;
      String city;
	Venue(String name,String city)
	{
		this.name=name;
		this.city=city;
	}
}
class Test
{
	public static void main(String s[])
	{
		String name;
		String city;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the venue name");
		name=sc.nextLine();
		System.out.println("enter the city name");
		city=sc.nextLine();
		Venue v= new Venue(name,city);
		System.out.println("venue details:");
		System.out.println("venue name:"+v.name);
		System.out.println(" city name"+v.city);
	}
}
