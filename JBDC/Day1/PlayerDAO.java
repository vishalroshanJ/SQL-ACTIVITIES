package com.ltts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.Myconnection;
import com.ltts.Model.Player;

public class PlayerDAO {
	
		public List<Player> getAllPlayers(){
			List<Player> li=new ArrayList<Player>();
			return li;

	}
		
	public Player getplayerById(int id) {
		Player p=new Player();
		return p;
	}
	
	public boolean insertPlayer(Player p) throws Exception {
		Connection mc=Myconnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?);");
		ps.setInt(1,getPlayerId());
		ps.setString(2,getPlayerName());
		ps.setInt(3,getTeamId());
		return ps.execute();
	}
	private int getTeamId() {
	
		return 0;
	}
	private int getPlayerId() {
		// TODO Auto-generated method stub
		return 0;
	}
	private String getPlayerName() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean updatePlayer(int id) {
		return true;
	}

	}