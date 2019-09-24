package com.soccer.web.daoImpl;

import com.soccer.web.dao.StadiumDAO;

public class StadiumDAOImpl implements StadiumDAO{
	private static StadiumDAOImpl instance = new StadiumDAOImpl();

	public static StadiumDAOImpl getInstance() {
		return instance;
	}
	
	private StadiumDAOImpl() {}

}
