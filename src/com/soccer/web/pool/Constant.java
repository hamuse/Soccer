package com.soccer.web.pool;

public class Constant {
	public  final static String 
			VENDOR = "oracle",
			ORACLE_DRIVER ="oracle.jdbc.OracleDriver",
			ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe" ,
			MARIA_DRIVER ="org.mariadb.jdbc.Driver",
			MARIA_URL = "jdbc:mariadb://localhost:3306" ,
					H2_DRIVER ="org.mariadb.jdbc.Driver",
					H2_URL = "jdbc:mariadb://localhost:3306" ,
			USERNAME="c##oracle" ,
			PASSWORD="oracle" ;
	
	
	public static final String VIEW_PATH = "WEB-INF/views/%s.jsp";
}
