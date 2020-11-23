package hcl;
import java.util.*;
public class Split {
	public static void main(String s[])
	{
		String details;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details");
		details=sc.next();
		Cricket c=new Cricket(details);
		c.loop();
		
	}

}
