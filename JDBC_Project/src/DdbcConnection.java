//step1. import sql package
import java.sql.*;

public class DdbcConnection {
	
  public static void main(String[] args) throws Exception{
	
	  //step2. load and register 
		Class.forName("org.postgresql.Driver");
		

	  
	  String url = "jdbc:postgresql://localhost:5432/demo";
	  String userName = "postgres";
	  String password = "root";
	  
	  //step3. create connection
	  Connection con = DriverManager.getConnection(url, userName, password);
	  System.out.println("Connection Established");
	  
	 //step4. create statement
//		Statement st = con.createStatement();
	  
	  String query = "insert into student values (?,?,?)";
	  PreparedStatement st = con.prepareStatement(query);
		
//		String query = "select s_name from student where s_id = 101";
//		String query = "select * from student";
//		String query = "insert into student values (103 , 'John' , 700)";
//		String query = "update student set s_name='Johnny' where s_id=103";
//		String query = "delete from student where s_id=103";
		
		
		
		st.setInt(1, 103);
		st.setString(2, "Max");
		st.setInt(3, 90);
	//step5. execute statement
		st.execute();
		
		
		
	//step6. close connection
		con.close();
		
	System.out.println("Connection Closed");
		
		
		

}
  
}
