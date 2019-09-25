package com.soccer.web.enums;

public enum DBUrl {
	ORACLE_URL,
	MARIA_URL ,
	H2_URL;
	
	@Override
	public String toString() {
	 String url = "";
	 
	 switch (this) {
	case ORACLE_URL:
		url = "jdbc:oracle:thin:@localhost:1521:xe";
				break;
	case MARIA_URL: 
		url = "jdbc:mariadb://localhost:3306";
	case 	H2_URL :
		url = "jdbc:mariadb://localhost:3306" ;
	default:
		break;
	}
		 
		return url;
	}
  
}
