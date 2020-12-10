import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement stm=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3307/zen", "root", "root");
			 if(con!=null)
			 {
				 stm=con.createStatement();
				 ResultSet rs=stm.executeQuery("select * from admin");
				 while(rs.next())
				 {
					 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
				 }
				 rs.close();
			 }
			 stm.close();
			 con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
