package com.soccer.web.factory;

import com.soccer.web.pool.Constant;

public  class DatabaseFactory {
	
	public static  Database createDatabase (String vendor) {
		Database db = null;
		switch (vendor) {
		case "oracle": db = new Oracle();		break;
		case "mariadb": db = new Maria();	break;
		case "h2": break;
	
		}
		return db;
	}
}