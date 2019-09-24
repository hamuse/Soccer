package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeamBean implements Serializable{
	private String teamId, regionName, teamName,
				eTeamName, origYYYY,
				stadiumId, zipCode1, zipCode2,
				address, ddd, tel, fax, homepage, owner;
				
}
