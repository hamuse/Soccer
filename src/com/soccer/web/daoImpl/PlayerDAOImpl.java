package com.soccer.web.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.soccer.web.dao.PlayerDAO;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constant;

public class PlayerDAOImpl implements PlayerDAO{
	private static PlayerDAOImpl instance = new PlayerDAOImpl();
	public static PlayerDAOImpl getInstance() {	return instance;}
	private PlayerDAOImpl() {}

	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION position \n" +
								"FROM PLAYER";
			ResultSet rs = DatabaseFactory
					.createDatabase(Constant.VANDOR)
					.getConnection()
					.prepareStatement(sql)
					.executeQuery();
			while(rs.next()) {
				System.out.println("position"+rs.getString("position"));
				positions.add(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return positions;
	}
	
	@Override
	public boolean insertPlayer(PlayerBean param) {
		boolean flag = false;
		try {
			String sql = "INSERT INTO PLAYER(PLAYER_ID, SOLAR, TEAM_"
					+ "ID,PLAYER_NAME)\n" + 
					"VALUES(?,?,'K03','김광진')\n";
			PreparedStatement stmt =DatabaseFactory
					.createDatabase(Constant.VANDOR).getConnection().prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			int rs = stmt.executeUpdate();
			flag =(rs ==1);
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	@Override
	public List<PlayerBean> selectTeamIdPosition(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<PlayerBean> selectTeamIdHeightName(PlayerBean param) {
		return null;
	}
	@Override
	public PlayerBean seletByPlayerIdSolar(PlayerBean param) {
		PlayerBean player = null;
		String sql = "SELECT *\r\n" + 
				"FROM PLAYER\r\n" + 
				"WHERE PLAYER_ID LIKE ?\r\n" + 
				"AND SOLAR LIKE ?";
		try {
			PreparedStatement stmt =DatabaseFactory
					.createDatabase(Constant.VANDOR).getConnection().prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				player = new PlayerBean();
				player.setBackNo(rs.getString("BACK_NO"));
				player.setBirthDate(rs.getString("BIRTH_DATE"));
				player.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setJoinYYYY(rs.getString("JOIN_YYYY"));
				player.setNation(rs.getString("NATION"));
				player.setNickName(rs.getString("NICKNAME"));
				player.setPlayerId(rs.getString("PLAYER_ID"));
				player.setPlayerName(rs.getString("PLAYER_NAME"));
				player.setPosition(rs.getString("POSITION"));
				player.setSolar(rs.getString("SOLAR"));
				player.setTeamId(rs.getString("TEAM_ID"));
				player.setWeight(rs.getString("WEIGHT"));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println("9.반환된 결과값:" +player.toString());
     return player;
	}
	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> pb = new ArrayList<>();
		String sql = "";
		try {
			PreparedStatement pst = DatabaseFactory
					.createDatabase(Constant.VANDOR)
					.getConnection().prepareStatement(sql);
			pst.setString(1, param.getPlayerId());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pb;
	}



}
