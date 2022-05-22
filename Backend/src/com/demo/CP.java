package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	
	public static Connection createC() {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connect....
			String user = "root";
			String password = "tiger";
			String url = "jdbc:mysql://localhost:3306/grey_goose";
			con = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}