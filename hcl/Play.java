package hcl;

import java.util.*;
class Player
{
      String name;
      String country;
	  String skill;
	Player(String name,String country,String skill)
	{
		this.name=name;
		this.country=country;
		this.skill=skill;
	}
}
class Play
{
	public static void main(String s[])
	{
		String name;
		String country;
		String skill;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  name");
		name=sc.nextLine();
		System.out.println("enter the country name");
		country=sc.nextLine();
		System.out.println("enter the skill");
		skill=sc.nextLine();
		Player v= new Player(name,country,skill);
		System.out.println("All Rounder:");
		System.out.println("Player details:");
		System.out.println(" name:"+v.name);
		System.out.println(" country name:"+v.country);
		System.out.println(" skill: "+v.skill);
		
	}
}
