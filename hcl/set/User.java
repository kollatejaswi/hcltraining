package com.hcl.set;


import java.util.*;
import java.util.List;
import java.util.*;

public class User {

	public static void main(String[] args) {
		String name;
		char id;
		int i=0;
		Scanner s=new Scanner(System.in);
		TreeSet<String> a=new TreeSet<>();
		do{
			System.out.println("enter the user name"+(i+1));
			name=s.nextLine();
			a.add(name);
			System.out.println("enter the choice(y/n)");
			id=s.nextLine().charAt(0);
			i++;
		}while(id=='y');
		System.out.println("user details are:"+a.size());
          
	}

}

