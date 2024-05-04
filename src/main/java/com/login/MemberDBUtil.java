// IT22128386
// Hettiarachchi S.R 
// 9.2

package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	/*---------------------------------validate1-------------------------------------------*/
	public static List<Member> validate(String userName, String password)
	{
		ArrayList<Member> mem = new ArrayList<>();
		//connection
		
		String url ="jdbc:mysql://localhost:3306/onlinetourguide";
		String user = "root";
		String pass = "123pp";
		//validate
		
	try {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement stmt =con.createStatement();
		//con = DBconnect.getConnection();
		//stmt = con.createStatement();
		
		String sql = "select * from member where username = '"+userName+"' and password = '"+password+"'";
		//rs = stmt.executeQuery(sql);
		ResultSet rs = stmt.executeQuery(sql);
		
		
		if(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String userU = rs.getString(4);
			String passU = rs.getString(5);
			String country = rs.getString(6);
			
			
			Member m = new Member(id ,name, email, userU, passU, country);
			mem.add(m);
		}
		} catch (Exception e) {
		e.printStackTrace();
	}
		return mem;
	}
	
	
	
	
	
	
	//-----------------------------------insert---------------------------------------------------
	
	
	
	
	
	
	
	public static boolean insertmember(String name,String email,String username,String password ,String country )
	{
		
		boolean isSuccess = false;
		
		//connection
		String url ="jdbc:mysql://localhost:3306/onlinetourguide";
		String user = "root";
		String pass = "123pp";
		
		
		//insert
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//con = DBconnect.getConnection();
			//stmt = con.createStatement();
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt =con.createStatement();
			
			String sql ="insert into member values(0,'"+name+"','"+email+"','"+username+"','"+password+"','"+country+"')";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false; 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}

	
	//----------------------------------update----------------------------------------------------//
	
	
	
	public static boolean updatemember(String id,String name ,String email,String username,String password,String country) 
	{
		boolean isSuccess = false;
		String url ="jdbc:mysql://localhost:3306/onlinetourguide";
		String user = "root";
		String pass = "123pp";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt =con.createStatement();
			
			String sql = "update member set name = '"+name+"', email = '"+email+"', username = '"+username+"', password = '"+password+"', country = '"+country+"'"+"where idmember ='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false; 
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
public static List<Member> getmemberDetails(String Id) {
    	
    	int convertedID = Integer.parseInt(Id);
    	String url ="jdbc:mysql://localhost:3306/onlinetourguide";
		String user = "root";
		String pass = "123pp";
    	ArrayList<Member> mem = new ArrayList<>();
    	
    	try {
    		
    		Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt =con.createStatement();
    		
			String sql = "select * from member where idmember='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int id = rs.getInt(1);
    			String name = rs.getString(2);
    			String email = rs.getString(3);
    			String username = rs.getString(4);
    			String password = rs.getString(5);
    			String country = rs.getString(6);
    			Member m = new Member(id,name,email,username,password,country);
    			mem.add(m);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		
    	}	
    	return mem;	
    }
    //-----------------------------delete---------------------------------------------//

public static boolean deletemember(String id) {
	boolean isSuccess = false;
	
	int convId = Integer.parseInt(id);
	
	String url ="jdbc:mysql://localhost:3306/onlinetourguide";
	String user = "root";
	String pass = "123pp";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement stmt =con.createStatement();
		
		String sql = "delete from member where idmember ='"+convId+"'";
		int rs = stmt.executeUpdate(sql);
		
		if (rs> 0) {
			isSuccess = true;
			
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
		
	}
	
	return isSuccess;
}

//-----------------------------validate2-----------------------------------------//
public static boolean memvalidate(String username, String password) {
	
	String url ="jdbc:mysql://localhost:3306/onlinetourguide";
	String user = "root";
	String pass = "123pp";
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement stmt =con.createStatement();
		String sql = "select * from member where username='"+username+"' and password='"+password+"'";
		rs = stmt.executeQuery(sql);
		
		if (rs.next()) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}
}
