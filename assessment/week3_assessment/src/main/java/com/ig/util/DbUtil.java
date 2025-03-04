package com.ig.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static final String url="jdbc:mysql://localhost:3306/demodb";
	private static final String user="root";
	private static final String pass="KRISHna@8333";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,pass);
	}

}
