package com.soccer.web.enums;

public enum DBDriver {
  ORACLE_DRIVER,
  MYSQL_DRIVER,
  MARIA_DRIVER,
  H2_DRIVER;
	
	@Override
	public String toString() {
		String driver = "";
		
		switch (this) {
		case ORACLE_DRIVER:
			driver = "oracle.jdbc.OracleDriver";
		case MARIA_DRIVER :
			 driver ="org.mariadb.jdbc.Driver";
		case 	H2_DRIVER :
			driver ="org.mariadb.jdbc.Driver";
			break;

		default:
			break;
		}
		
		return driver;
	}
}
