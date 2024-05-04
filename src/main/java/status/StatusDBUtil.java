// IT22070876
// Mathota Arachchi S S
// Group 7.1

package status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatusDBUtil {
	
	private static Connection con = null;
	private static  Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	public static boolean validate(String tour) {						// Retrieve the values in the database
		try {															// check the  database connection	
			con = ConnectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from status where Tour ='"+tour+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
	public static List<Status> getStatus(String tour){				
		
		ArrayList<Status> sts = new ArrayList<>();
			
		try {
			con = ConnectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from status where Tour ='"+tour+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String statusid1 = rs.getString(1);
				String tour1 = rs.getString(2);
				String accomodation1 = rs.getString(3);
				String transport1 = rs.getString(4);
				String itinerary1 = rs.getString(5);
				
				Status i = new Status(statusid1,tour1,accomodation1,transport1,itinerary1);
				sts.add(i);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return sts;
}
   
	@SuppressWarnings("resource")																					
	public static boolean insert(String tour, String accommodation, String transport, String itinerary) {			// check the  database connection
	    Connection con = null;																	
	    PreparedStatement stmt = null;
	    boolean isSuccess = false;

	    try {
	        con = ConnectDB.getConnection();
	        																										// check the tour id already exist
	        String countSql = "SELECT COUNT(*) FROM status WHERE Tour = ?";
	        stmt = con.prepareStatement(countSql);
	        stmt.setString(1, tour);
	        ResultSet resultSet = stmt.executeQuery();
	        resultSet.next();
	        int count = resultSet.getInt(1);

	        if (count > 0) {
	            return false;
	        } else {
	            String insertSql = "INSERT INTO status(Tour, Accommodation, Transport, Itinerary) VALUES(?, ?, ?, ?)";				//   insert values for database 
	            stmt = con.prepareStatement(insertSql);
	            stmt.setString(1, tour);
	            stmt.setString(2, accommodation);
	            stmt.setString(3, transport);
	            stmt.setString(4, itinerary);
	            
	            int rs = stmt.executeUpdate();
	            
	            if (rs > 0) {
	                isSuccess = true;
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        isSuccess = false;
	    } finally {
	        try {
	            if (stmt != null) {
	                stmt.close();
	            }
	            if (con != null) {
	                con.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return isSuccess;
	}

	public static boolean Update(String statusid,String tour, String accomodation, String transport, String itinerary) {					// update values on database
		
		try {																																// check the  database connection
			con = ConnectDB.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE status set Tour='"+tour+"', Accommodation='"+accomodation+"', Transport='"+transport+"', Itinerary='"+itinerary+"' WHERE StatusID='"+statusid+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}

public static boolean Delete(String statusid, String tour, String accomodation, String transport, String itinerary) {				// delete values on database
	
	try {																															// check the  database connection
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
		String sql = "DELETE FROM status WHERE Tour='"+tour+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		
		}
		else {
			isSuccess = false;
		}
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	return isSuccess;
	
	}
    
}
