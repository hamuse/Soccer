package com.soccer.web.serviseImpl;

import com.soccer.web.sevices.StadiumService;

public class StadiumServiceImpl implements StadiumService {
	private static StadiumServiceImpl instance = new StadiumServiceImpl();

	public static StadiumServiceImpl getInstance() {
		return instance;
	}
	
	private StadiumServiceImpl() {}
}
