package hcl;

import java.util.Scanner;

public class Bank   {

	public static void main(String[] args) {
		String ba;
		int choice;
		System.out.println("choose account details");
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");
		Scanner sc= new Scanner(System.in);
		choice=sc.nextInt();
		sc.nextLine();
		Saving s=new Saving();
		Current c1=new Current();
		switch(choice)
		{
		case 1:
			System.out.println("enter account details");
			ba=sc.nextLine();
			String c2[]=ba.split(",");
			s.setAccName(c2[0]);
			System.out.println("account name:"+s.getAccName());
			s.setAccNo(c2[1]);
			System.out.println("account number:"+s.getAccNo());
			s.setBankName(c2[2]);
			System.out.println("bank number:"+s.getBankName());
			s.setOrgName(c2[3]);
			System.out.println("org name:"+s.getOrgName());
			break;
		case 2:
			System.out.println("enter account details");
			ba=sc.nextLine();
			String c3[]=ba.split(",");
			s.setAccName(c3[0]);
			System.out.println("account name:"+c1.getAccName());
			s.setAccNo(c3[1]);
			System.out.println("account number:"+c1.getAccNo());
			s.setBankName(c3[2]);
			System.out.println("bank number:"+c1.getBankName());
			s.setOrgName(c3[3]);
			System.out.println("tin number:"+c1.getTinNumber());
			break;
			
		}

	}

}
