package hcl;

import java.util.Scanner;

public class ShowDetails {

	public static void main(String[] args) {
		String name;
		String details;
		String ownerName;
		int noOfshoes;
		int noOftickets;
		int noOfstall;
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		name=s.nextLine();
		System.out.println("enter details");
		details=s.nextLine();
		System.out.println("enter owner name");
		ownerName=s.nextLine();
		System.out.println("enter no of shows");
		noOfshoes=s.nextInt();
		System.out.println("enter no of tickets");
		noOftickets=s.nextInt();
		System.out.println("enter no of stalls");
		noOfstall=s.nextInt();
		Exhibition e= new Exhibition();
		StageEvents se=new StageEvents();
		e.setOwnerName(ownerName);
		e.setName(name);
		e.setDetails(details);
		e.setNoOfstall(noOfstall);
		se.setNoOfshoes(noOfshoes);
		se.setNoOftickets(noOftickets);
		e.print();
		se.print();
		

	}

}
