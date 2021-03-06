package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.ltts.Model.Player;
import com.ltts.Model.Team;
import com.ltts.dao.PlayerDAO;
import com.ltts.dao.TeamDAO;

public class MainProject {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//player entry
		System.out.println("Enter Player Details: ");
		System.out.println("Enter Player ID: ");
		     int pno=Integer.parseInt(br.readLine());
		System.out.println("Enter Player Name:");
		     String name=br.readLine();
		//team entry
		System.out.println("Enter Team Details: ");
		System.out.println("Enter Team ID: ");
		     int tno=Integer.parseInt(br.readLine());
		System.out.println("Enter Team Name:");
		     String tname=br.readLine();
		//calling player objects
		     Player t=new Player(pno,name,tno);
		     PlayerDAO td=new PlayerDAO();
		//checking sucessfull or not
				boolean y=td.insertPlayer(t);
				System.out.println("susccessfully"+y);
		//calling team objects
		    Team tt=new Team(tno,tname);
		    TeamDAO ttd=new TeamDAO();
		//checking succesfull or not
		       boolean x=ttd.insertTeam(tt);
		       System.out.println("susccessfully"+x);
		
		
		
		
		
		
		

	}

}
