package com.ltts.Model;

public class Team {
	private String teamname;
	private int playerid;
	private int teamid;
	
	public Team() {
		super();
	}
	public Team( int teamid,String teamname) {
		super();
		this.teamname = teamname;
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	@Override
	public String toString() {
		return "TeamName =" + teamname + "\nPlayerid=" + playerid + "\nTeamid=" + teamid;
	}
}
