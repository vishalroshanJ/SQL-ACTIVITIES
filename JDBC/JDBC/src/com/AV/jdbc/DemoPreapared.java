package com.AV.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoPreapared {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcSample","root","root");
		PreparedStatement ps = c.prepareStatement("select * from customer");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString(1)+" " + rs.getString(2));
		}
		
		c.close();
		
	}

}
