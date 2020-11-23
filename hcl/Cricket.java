package hcl;

public class Cricket {
	String details;
	public Cricket() {
		// TODO Auto-generated constructor stub
	}
	public Cricket(String details) {
		super();
		this.details = details;
	}
	public void loop()
	{
		String s2[]=details.split(",");
		System.out.println("players details:");
		System.out.println("Player name:"+s2[0]);
		System.out.println("Country name:"+s2[1]);
		System.out.println("skills:"+s2[2]);
	}

}
