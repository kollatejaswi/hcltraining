package hcl;

public class Tv {
	 String name;
	 String details;
     String ownerName;
	 String type;
	 int feet;
	 char choice;
	 int tvno;
	 int cost;
	public Tv(String type, int feet) {
		super();
		this.type = type;
		this.feet = feet;
	}
	public Tv(String type, int feet, int tvno) {
		super();
		this.type = type;
		this.feet = feet;
		this.tvno = tvno;
	}
	 
      public void without(String type, int feet)
      {
    	  switch(type)
    	  {
    	     case "Platinum":
    		  cost=200*feet;
    		  break;
    	     case "diamond":
    	    	 cost=150*feet;
    	    	 break;
    	     case "gold":
    	    	 cost=100*feet;
    	    	 break;
    	  }
    	  System.out.println("cost of the stall:"+cost);
      }
      public void with(String type, int feet,int tvo)
      {
    	  switch(type)
    	  {
    	     case "Platinum":
    		  cost=200*feet+(tvo*10000);
    		  break;
    	     case "diamond":
    	    	 cost=150*feet+(tvo*10000);
    	    	 break;
    	     case "gold":
    	    	 cost=100*feet+(tvo*10000);
    	    	 break;
    	  }
    	  System.out.println("cost of the stall:"+cost);
      }
}
