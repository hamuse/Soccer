package com.soccer.web.daoImpl;

import com.soccer.web.dao.TeamDAO;

public class TeamDAOImpl implements TeamDAO{
	private static TeamDAOImpl instance = new TeamDAOImpl();
	
	public static TeamDAOImpl getInstance() {
		return instance;
	}

	private TeamDAOImpl() {}

}
