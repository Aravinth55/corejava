import java.sql.*;
public class Myproject {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Aravinth552000");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM redmi");
			while (rs.next()) {
				System.out.println(rs.getString("cust_Name")+"\t"+rs.getString("email_id"));
			}
			con.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}
}
