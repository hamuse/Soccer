package com.soccer.web.factory;

import com.soccer.web.enums.DB;
import com.soccer.web.pool.Constant;

public  class DatabaseFactory {
	
	public static  Database createDatabase (String vendor) {
		Database db = null;
		switch (DB.valueOf(vendor)) {
		case ORACLE : db = new Oracle();		break;
		case MARIA : db = new Maria();	break;
		case H2 : break;
	
		}
		return db;
	}
}