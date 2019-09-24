package com.soccer.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.pool.Constant;

public class Maria implements Database {

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Constant.MARIA_DRIVER);
			conn = DriverManager.getConnection(Constant.MARIA_URL,Constant.USERNAME,Constant.PASSWORD);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
