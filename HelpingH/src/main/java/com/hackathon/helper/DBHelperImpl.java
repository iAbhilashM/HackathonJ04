package com.hackathon.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelperImpl implements DBHelper {
	static {
		try {
			Class.forName(DBHelper.DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	Connection conn = null;

	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(DBHelper.URL, DBHelper.USER, DBHelper.PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public Statement getStatement() {
		Statement st = null;
		try {
			st = getConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	public PreparedStatement getPreparedStatement(String query) {
		PreparedStatement pst = null;
		try {
			pst = getConnection().prepareStatement(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pst;
	}

	public void closeConnection() {

		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
