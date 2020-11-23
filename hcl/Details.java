package hcl;

import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		int wicke;
		String str;
		Long over;
		Long ball;
	    String wicketType;
	    String playerName;
	    String bowlerName;
	    Scanner sc=new Scanner(System.in);
	    Wicket w= new Wicket();
	    System.out.println("enter the number of wickets");
	    wicke=sc.nextInt();
	    sc.nextLine();
	    String stri[]=new String[wicke];
	    for(int i=0;i<wicke;i++)
	    {
	    	System.out.println("enter the details of wicket"+(i+1));
	    	str=sc.nextLine();
	    	stri[i]=str;
	     }
	    for(String a:stri)
	    {
	    	String[] b= a.split(",");
	    	w.setOver(Long.valueOf(b[0]));
	    	w.setBall(Long.valueOf(b[1]));
	    	w.setWicketType(b[2]);
	    	w.setPlayerName(b[3]);
	    	w.setBowlerName(b[4]);
	    	System.out.println("over:"+w.getOver());
			System.out.println("ball:"+w.getBall());
			System.out.println("wicket type:"+w.getWicketType());
			System.out.println("player name:"+w.getPlayerName());
			System.out.println("blower name:"+w.getBowlerName());

	    	
	    }

	}

}
