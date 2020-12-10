import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Executeupdate {

	public static void main(String[] args) throws SQLException {
		int id;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("enter id and name");
		id=s.nextInt();
		s.nextLine();
		name=s.nextLine();
		Connection con=null;
		Statement stm=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3307/admin", "root", "root");
			 if(con!=null)
			 {
				 stm=con.createStatement();
				 int rs=stm.executeUpdate("insert into admin values('"+id+"','"+name+"')");
	              if(rs!=0)
	              {
	            	  System.out.println("insertion is done successfull");
	              }
			 }
			 stm.close();
			 con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
