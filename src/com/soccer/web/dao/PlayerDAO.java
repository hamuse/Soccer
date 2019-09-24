package com.soccer.web.dao;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDAO {
	// 2. 포지션 종류(중복제거,없으면 빈공간)
	public List<String> selectPositions();
	
	//4.번
	public List<PlayerBean> selectTeamIdPosition(PlayerBean param);
	//5번 
	public List<PlayerBean> selectTeamIdHeightName(PlayerBean param);
}
