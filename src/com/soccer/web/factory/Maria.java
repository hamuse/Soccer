package com.soccer.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.enums.DBDriver;
import com.soccer.web.enums.DBUrl;
import com.soccer.web.pool.Constant;

public class Maria implements Database {

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.MARIA_DRIVER.toString());
			conn = DriverManager.getConnection(DBUrl.MARIA_URL.toString(),Constant.USERNAME,Constant.PASSWORD);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
