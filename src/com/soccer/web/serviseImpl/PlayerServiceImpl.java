package com.soccer.web.serviseImpl;

import java.util.ArrayList;
import java.util.List;

import com.soccer.web.dao.PlayerDAO;
import com.soccer.web.daoImpl.PlayerDAOImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.sevices.PlayerService;

public class PlayerServiceImpl implements PlayerService {
    private static PlayerServiceImpl instance = new PlayerServiceImpl(); // 싱글톤 
    
    
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	private PlayerServiceImpl() {	}
	@Override
	public PlayerBean login(PlayerBean param) {
		System.out.println("★★★ 6. PlayerServiceImpl 의 login() 으로 이동 ★★★ ");
		System.out.println(String.format("param 값 출력 : %s, %s ",
				param.getPlayerId(), 
				param.getSolar()));
	
		return PlayerDAOImpl.getInstance().seletByPlayerIdSolar(param);
	}
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
