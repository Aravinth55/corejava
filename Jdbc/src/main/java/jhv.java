
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;
public class jhv {

	public static void main(String[] args) {
		insertImage();}
		//retriveimage();}
	public static void insertImage() {
		try
        {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Aravinth552000");
             PreparedStatement ps=con.prepareStatement("insert into  IMGTABLE  values(?,?)");
             ps.setString(1,"Aravinth");
             FileInputStream fin=new FileInputStream("E:\\tem\\3104.JPG");
             ps.setBinaryStream(2, fin,fin.available());
             int i=ps.executeUpdate();
             System.out.println(i + "Rows affected");
             con.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
	}
	public static void retriveimage() {
	try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","Aravinth552000");  
		      
		PreparedStatement ps=con.prepareStatement("select * from imgtable");  
		ResultSet rs=ps.executeQuery();  
		if(rs.next()){//now on 1st row  
		              
		Blob b=rs.getBlob(2);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
		FileOutputStream fout=new FileOutputStream("E:\\tem\\3104.JPG");  
		fout.write(barr);  
		              
		fout.close();  
		}//end of if  
		System.out.println("RetrieveImage successs");  
		              
		con.close();  
		}catch (Exception e) {e.printStackTrace();  }  
		}  
		}  
