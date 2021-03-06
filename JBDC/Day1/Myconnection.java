package com.ltts.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Myconnection {
	
		public static Connection getConnection() throws Exception {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			return con;
		}

	}


