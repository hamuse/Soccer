package com.soccer.web.serviseImpl;

import com.soccer.web.sevices.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService {
	private static ScheduleServiceImpl instance = new ScheduleServiceImpl();

	public static ScheduleServiceImpl getInstance() {
		return instance;
	}
	private ScheduleServiceImpl() {}
}
