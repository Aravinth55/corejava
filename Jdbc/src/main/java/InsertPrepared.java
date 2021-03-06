import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class InsertPrepared {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"Aravinth552000");

			PreparedStatement stmt = con.prepareStatement("insert into CITYS1 values(?,?)");
			stmt.setInt(1, 4567);// 1 specifies the first parameter in the query
			stmt.setString(2, "koyembedu");
			stmt.setInt(1, 4568);
			stmt.setString(2, "thirunelvelli");
			stmt.setInt(1, 3456);
			stmt.setString(2, "ambattur");
			stmt.setInt(1, 3432);
			stmt.setString(2, "karimedu");
			
			stmt.setString(2, "ooty");
			stmt.setInt(1, 4444);
			stmt.setInt(1, 5543);
			stmt.setString(2, "tuticorin");
			stmt.setInt(1, 9999);
			stmt.setString(2, "pollachi");

			//PreparedStatement stmt1 = con.prepareStatement("update citys1 set city_name=? where city_id=?");
			//stmt1.setString(1, "chennai");// 1 specifies the first parameter in the query i.e. name
			//stmt1.setInt(2, 1236);
			//PreparedStatement stmt3=con.prepareStatement("delete from citys1 where city_id=?");  
			//stmt.setInt(1,1234);  
			  
			//int i=stmt.executeUpdate();  
			//System.out.println(i+" records deleted"); 
			PreparedStatement stmt3=con.prepareStatement("delete from chainsys where id=?");  
			stmt3.setInt(1,7);  
			  
			int i=stmt3.executeUpdate();  
		System.out.println(i+" records deleted"); 


			//int i = stmt.executeUpdate();
			//System.out.println(i + " records inserted");
			/*PreparedStatement stmt2=con.prepareStatement("select * from citys1");  
			ResultSet rs=stmt2.executeQuery();  
			while(rs.next()){  
			System.out.println(rs.getInt(1)+" "+rs.getString(2));  
			}  */

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
