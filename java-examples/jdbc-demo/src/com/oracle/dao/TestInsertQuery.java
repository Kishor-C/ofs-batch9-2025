package com.oracle.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestInsertQuery {
	public static void main(String[] args) {
		final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String DB_USERNAME = "kishor_c";
		final String DB_PASSWORD = "Welcome123";
		// since from java 8 onwards class loading is required
		// we can also use try with resource closing modern syntax
		// so that you don't have explicitly close the resources
		final String DB_INSERT_QUERY = "insert into employee values(?,?,?)";
		try (Connection con = DriverManager
				.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
				PreparedStatement pstmt = 
						con.prepareStatement(DB_INSERT_QUERY);
			) {
			int id = 5;	String name = "Sourav";
			LocalDate dob = LocalDate.parse("1978-04-24");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDate(3, Date.valueOf(dob));//java.sql.Date
			// in your case study you use LocalDate in your model class
			int count = pstmt.executeUpdate();
			System.out.println("Count = "+count);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
