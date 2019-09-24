package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class ScheduleBean implements Serializable{
	private String stadiumId, scheDate, gubun, hometeamId, awayteamId,
				homeScore, awayScore;

}
