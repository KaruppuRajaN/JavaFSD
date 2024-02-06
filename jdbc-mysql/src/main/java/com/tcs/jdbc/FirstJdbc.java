package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstJdbc {

	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Raja123?",
					"root","Root123$");
			
			//Select Statement
			String sSQL = "Select * from employee;";
			PreparedStatement pstmt = conn.prepareStatement(sSQL);
			ResultSet rs = pstmt.executeQuery(sSQL);
			while(rs.next()) {
				System.out.println(rs.getInt("empid")+ " - "+rs.getString("empname"));
			}
			
			//Insert Statement
//			sSQL = "Insert into employee values( ? , ? );";
//			pstmt = conn.prepareStatement(sSQL);
//			pstmt.setInt(1, 124);
//			pstmt.setString(2, "Joseph");
//			pstmt.execute();
			
			//Update Statement
			sSQL = "Update employee set empname = ? where empid = ? ;";
			pstmt = conn.prepareStatement(sSQL);
			pstmt.setString(1, "Mansoor Ali");
			pstmt.setInt(2, 123);
			int n = pstmt.executeUpdate();
			
			//Again Select
			sSQL = "Select * from employee;";
			pstmt = conn.prepareStatement(sSQL);
			rs = pstmt.executeQuery(sSQL);
			ResultSetMetaData rsms = rs.getMetaData();
			System.out.println(rsms.getColumnName(1)+ " - "+rsms.getColumnName(2));
			while(rs.next()) {
				System.out.println(rs.getInt("empid")+ " - "+rs.getString("empname"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
