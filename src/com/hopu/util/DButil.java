package com.hopu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButil {
	
	private static Connection conn;
	private static PreparedStatement pst;

	public static PreparedStatement getpst(String sql) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_2020_11_6", "root", "root");
			
			pst = conn.prepareStatement(sql);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pst;
		
	}
	
	
	public static void close(ResultSet rs) {
		try {
			if (rs != null) {				
				rs.close();
			}
			if (pst != null) {				
				pst.close();
			}
			if (conn != null) {				
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
