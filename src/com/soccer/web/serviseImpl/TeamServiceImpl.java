package com.soccer.web.serviseImpl;

import com.soccer.web.sevices.TeamService;

public class TeamServiceImpl implements TeamService{
	private static TeamServiceImpl instance = new TeamServiceImpl();

	public static TeamServiceImpl getInstance() {
		return instance;
	}
	
	private TeamServiceImpl() {}

}
