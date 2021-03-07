package com.ltts.connection;




import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBuilder {
	
	public static Connection getConnection() throws Exception
	{
		
		Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/MinorProject","root","iamishanishu");
		return c;
		
	}
	

}