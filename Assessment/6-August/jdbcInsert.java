import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcInsert {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/abcd";

	static final String USER = "root";
	static final String PASS = "pass@word1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("ENter name:");
		String name=sc.next();
		try{
			//STEP 2: Register and Load JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection to database server
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query
			System.out.println("Creating statement...");
			pstmt = conn.prepareStatement("insert into simple values(?, ?)");

			pstmt.setInt(1,id);

			pstmt.setString(2,name);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(pstmt!=null)
					pstmt.close();
			}catch(SQLException se2){
			}// nothing we can do
		}//end try
		System.out.println("Done...");
	}//end main




}
