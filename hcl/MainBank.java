package hcl;

import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bank details");
        str=sc.nextLine();
        AccountBo ab= new AccountBo();
        ab.details(str);
        
        
	}

}
