package com.ltts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.ltts.Configuration.MyConnection;
import com.ltts.model.Player;

public class PlayerDAO {
//DIPLAY THE DETAILS BY ID
public void getplayerById(int id) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps = mc.prepareStatement("SELECT o.name,i.teamname, i.coachname FROM player o, team i where o.playerId=i.capsid && o.playerId ="+id+"");
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		System.out.println("Player name :"+rs.getString(1)+"\nTeam name   :" + rs.getString(2)+"\nCoach name  :" + rs.getString(3));
	}
}

//insert the player
public void insertPlayer(Player p) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?,?);");
	  ps.setInt(1,p.getPlayerId());
	  ps.setString(2,p.getName());
	  ps.setString(3,p.getDateOfBirth());
	  ps.setString(4,p.getSkill());
	  ps.setInt(5,p.getNumberOfMatches());
	  ps.setInt(6,p.getRuns());
	  ps.setInt(7,p.getWickets());
	  ps.setString(8,p.getNationality());
	  ps.setDouble(9,p.getPowerRating());
	  ps.setInt(10,p.getTeamId());
	 System.out.println(p.getName());
	 ps.executeUpdate();	
	 System.out.println("Successfully Added");
}

public void updatePlayername(int selectid,String name) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET name = '"+name+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
}

public void updatePlayerDob(int selectid, String ppno) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET dateOfBirt = '"+ppno+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
	
	
}

public void updatePlayerSkill(int selectid, String nname) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET skill = '"+nname+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
	
}

public void updatePlayernom(int selectid, int pppno) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET numberO = '"+pppno+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
}

public void updatePlayerruns(int selectid, int nnname) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET runs = '"+nnname+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
	
}

public void updatePlayerwic(int selectid, int ppppno) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET wickets = '"+ppppno+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
}

public void updatePlayerNati(int selectid, String nnnname) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET nationality = '"+nnnname+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
}


public void updatePlayerPower(int selectid, int pppppno) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET powerRating = '"+pppppno+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
	
}

public void updatePlayerTeamID(int selectid, int tno) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET teamId = '"+tno+"' WHERE (playerId = "+selectid+")");
	 ps.executeUpdate();	
	 System.out.println("Successfully updated");
	
}

public void updatePlayer(int selectid,Player p) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("UPDATE player SET playerId=?,name=?,dateOfBirt=?,skill=?,numberO=?,runs=?,wickets=?,nationality=?,powerRating=?,teamId=? WHERE(playerId ="+selectid+")");
	  ps.setInt(1,p.getPlayerId());
	  ps.setString(2,p.getName());
	  ps.setString(3,p.getDateOfBirth());
	  ps.setString(4,p.getSkill());
	  ps.setInt(5,p.getNumberOfMatches());
	  ps.setInt(6,p.getRuns());
	  ps.setInt(7,p.getWickets());
	  ps.setString(8,p.getNationality());
	  ps.setDouble(9,p.getPowerRating());
	  ps.setInt(10,p.getTeamId());
	 System.out.println(p.getName());
	 ps.executeUpdate();	
	 System.out.println("Successfully Added");
	
}

public void displayplayers() throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps = mc.prepareStatement("SELECT * from player");
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		
		  System.out.println(":"+rs.getString(1)+"  :" + rs.getString(2)+"   :" +
		  rs.getString(3)+ "   :"+rs.getString(4)+"    :" + rs.getString(5)+"      :" +
		  rs.getString(6)+ "   :"+rs.getString(7)+"    :" + rs.getString(8)+"      :" +
		  rs.getString(9)+ "   :"+rs.getString(10));
		 
		//System.out.println(String.format(format, id+"", age+"", first, last));
	}
	
	
}

public void displayplayersTeam(String teamname) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps = mc.prepareStatement("SELECT * FROM player p , team t where p.teamId= t.idteam && t.teamname ='"+teamname+"'");
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		System.out.println(":"+rs.getString(1)+":" + rs.getString(2)+":" + rs.getString(3)+
				":"+rs.getString(4)+":" + rs.getString(5)+":" + rs.getString(6)+
				":"+rs.getString(7)+":" + rs.getString(8)+":" + rs.getString(9)+
				":"+rs.getString(10)+":" + rs.getString(11)+":" + rs.getString(12)+
				":"+rs.getString(13)+":" + rs.getString(14)+":" + rs.getString(15)
				);
	}
	
}

public void displayplayersTeamskill(String iplname, String iplskill) throws Exception {
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps = mc.prepareStatement("SELECT * FROM player p , team t where p.teamId= t.idteam && t.teamname ='"+iplname+"'&& p.skill ='"+iplskill+"'");
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		System.out.println(":"+rs.getString(1)+":" + rs.getString(2)+":" + rs.getString(3)+
				":"+rs.getString(4)+":" + rs.getString(5)+":" + rs.getString(6)+
				":"+rs.getString(7)+":" + rs.getString(8)+":" + rs.getString(9)+
				":"+rs.getString(10)+":" + rs.getString(11)+":" + rs.getString(12)+
				":"+rs.getString(13)+":" + rs.getString(14)+":" + rs.getString(15)
				);
	}
	
}
}