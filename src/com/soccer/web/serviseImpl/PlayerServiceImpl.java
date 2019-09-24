package com.soccer.web.serviseImpl;

import java.util.ArrayList;
import java.util.List;

import com.soccer.web.dao.PlayerDAO;
import com.soccer.web.daoImpl.PlayerDAOImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.sevices.PlayerService;

public class PlayerServiceImpl implements PlayerService {
    private static PlayerServiceImpl instance = new PlayerServiceImpl();
    
    
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	private PlayerServiceImpl() {	}
	//1번
	@Override
	public List<String> frindPositions() {
     List<String> positions =   PlayerDAOImpl.getInstance().selectPositions();
		return positions;
	}
   //2번
	@Override
	public List<PlayerBean> findbyTeamIdPosition(PlayerBean param) {
	 
	 List<PlayerBean> players =  PlayerDAOImpl.getInstance().selectTeamIdPosition(param);
	    	
		return players;
	}
     //3번 
	@Override
	public List<PlayerBean> findbyTeamIdHeightName(PlayerBean param) {
	
		List<PlayerBean> players =	PlayerDAOImpl.getInstance().selectTeamIdHeightName(param);
		return players;
	}

}
