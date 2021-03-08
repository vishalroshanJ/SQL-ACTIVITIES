package com.AV.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoMain {
	public static void main(String[] args) throws SQLException {
		
		
		Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcSample","root","root");
		Statement s = c.createStatement();
		//s.execute("insert into customer values ('Vishal','23')");
		s.executeUpdate("update customer set cname ='Vinayak' where age='23'");
		
		
		ResultSet rs = s.executeQuery("select * from customer");
		
		while(rs.next()){
			System.out.println(rs.getString(1)+" " + rs.getString(2));
		}
		
		c.close();
	}

}
