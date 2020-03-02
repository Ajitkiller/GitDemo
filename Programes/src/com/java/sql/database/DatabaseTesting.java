package com.java.sql.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DatabaseTesting {
	
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
	
		String url="jdbc:mysql://localhost:3306/";
		String dbname="klr";
		String DBdriver="com.mysql.jdbc.Driver";
		String Username="root";
		String Password="Ajit1995";
		
		Connection conn;
		//create object
		Class.forName(DBdriver).newInstance();
		//DB connection
		conn=DriverManager.getConnection(url+dbname, Username, Password);
		//insert query
		PreparedStatement psmt=conn.prepareStatement("select * from emp");
		//Execute query
		ResultSet rs=psmt.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString(2));
		}
		
		
		
	}

	
	
	
	
	
	
	
}
