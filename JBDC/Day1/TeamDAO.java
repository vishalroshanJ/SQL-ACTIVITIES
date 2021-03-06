package com.ltts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.Model.Team;
import com.ltts.configuration.Myconnection;
//class for team database
public class TeamDAO {
	//team list objects
	public List<Team> getAllPlayers(){
		List<Team> li=new ArrayList<Team>();
		return li;
}
	//.
public Team getplayerById(int id) {
	Team p=new Team();
	return p;
}
//inserting to the team database
public boolean insertTeam(Team p) throws Exception {
	Connection mc=Myconnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("insert into Team values(?,?);");
	ps.setInt(1,getTeamId());
	ps.setString(2,getTeamName());
	return ps.execute();
}

private int getTeamId() {
	// TODO Auto-generated method stub
	return 0;
}
private String getTeamName() {
	// TODO Auto-generated method stub
	return null;
}
public boolean updateTeam(int id) {
	return true;
}
	
}
