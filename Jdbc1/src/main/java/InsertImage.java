
import java.sql.*;
import java.io.*;

public class InsertImage {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Aravinth552000");

			PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?)");
			ps.setString(1, "Aravinth");

			FileInputStream fin = new FileInputStream("d:\\3104.JPG");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
