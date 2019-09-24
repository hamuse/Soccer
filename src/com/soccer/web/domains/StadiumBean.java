package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class StadiumBean implements Serializable{
	private String stadiumId, stadiumName, hometeamId, seatCount, address , ddd, tel ;
	

}
