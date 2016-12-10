package com.hackathon.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public interface DBHelper {

	String DRIVER = "com.mysql.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/helpingHand";
	String USER = "root";
	String PASSWORD = "root";

	Connection getConnection();

	Statement getStatement();

	PreparedStatement getPreparedStatement(String query);

	void closeConnection();
}
