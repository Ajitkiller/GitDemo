package com.java.sql.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tc3AllData {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		
		String url="jdbc:mysql://localhost:3306/";
		String dbname="klr";
		String DBdriver="com.mysql.jdbc.Driver";
		String username="root";
		String password="Ajit1995";
		
		Connection con;
		//create database
		Class.forName(DBdriver).newInstance();
		//connection database
		con=DriverManager.getConnection(url+dbname, username, password);
		
		//insert query
		PreparedStatement pst=con.prepareStatement("select * from emp");
		//execute query
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			for (int i = 1;i<=8; i++) {
				
			
			System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
