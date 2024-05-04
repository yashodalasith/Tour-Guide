// IT22070876
// Mathota Arachchi S S
// Group 7.1

package status;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

	private static String url = "jdbc:mysql://localhost:3306/onlinetourguide";
	private static String userName = "root";
	private static String password = "123pp";
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con  = DriverManager.getConnection(url, userName, password);
		}
		catch(Exception e) {
			System.out.println("coonection not success !!");
		}
		return con;
	}
	
}
