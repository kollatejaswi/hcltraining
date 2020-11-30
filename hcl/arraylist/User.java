package com.hcl.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		String name;
		char id;
		int i=0;
		Scanner s=new Scanner(System.in);
		List<String> a=new ArrayList<>();
		do{
			System.out.println("enter the user name"+(i+1));
			name=s.nextLine();
			a.add(name);
			System.out.println("enter the choice(y/n)");
			id=s.nextLine().charAt(0);
			i++;
		}while(id=='y');
		System.out.println("user details are:");
          for(String s1:a)
          {
        	  System.out.println(s1);
          }
	}

}
