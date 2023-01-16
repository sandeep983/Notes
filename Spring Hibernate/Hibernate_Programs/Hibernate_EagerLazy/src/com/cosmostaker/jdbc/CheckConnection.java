package com.cosmostaker.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckConnection {
	public static void main(String[] args) {
		Connection con = null;
		String jdbc_Url = "jdbc:mysql://localhost:3306/hibernate_o2m?useSSL=false";
		String user = "root";
		String pass = "admin";
		
		try {
			System.out.println("Connecting to Database.");
			
			con = DriverManager.getConnection(jdbc_Url, user, pass);
			
			System.out.println("Connection successful.");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con != null) {
					con.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
