package com.db;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
public class DBConnect {
private static Connection conn;
public static Connection getConn() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management", "root", "Sourav@15");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return conn;
}
}