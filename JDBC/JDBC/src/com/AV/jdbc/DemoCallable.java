package com.AV.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoCallable {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcSample","root","root");
		CallableStatement stmt=c.prepareCall("{call insertR(?,?)}");  
		
		stmt.setString(1,"jai");  
		stmt.setString(2,"24");  
		stmt.execute();  
		  
		System.out.println("success");  

		
		
}
}