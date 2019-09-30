package com.soccer.web.sevices;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerService {
	//1. 임이의 로그인
	public PlayerBean login(PlayerBean param);
	// 2. 포지션 종류(중복제거,없으면 빈공간)
	public List<String> frindPositions();
	// 4 수원팀(ID: K02)골키퍼
	public List<PlayerBean> findbyTeamIdPosition(PlayerBean param);
	
	public List<PlayerBean> findbyTeamIdHeightName(PlayerBean param);
}
