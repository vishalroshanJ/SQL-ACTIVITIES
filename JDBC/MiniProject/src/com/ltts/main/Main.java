package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.Date;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.ltts.Configuration.MyConnection;
import com.ltts.Dao.PlayerDAO;
import com.ltts.Dao.TeamDAO;
import com.ltts.model.Player;

public class Main {

	public static void main(String[] args) throws Exception {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//player entry
    	System.out.println("Enter Player Details: ");
		System.out.println("Enter Player ID: ");
		     int pno=Integer.parseInt(br.readLine());
		System.out.println("Enter Player Name:");
		     String name=br.readLine();
		     System.out.println("Enter DateOfBirth() in YYYY/MM/DD");
		     String ppno=br.readLine();
		System.out.println("Enter Skill");
		     String nname=br.readLine();
		     System.out.println("Enter Number Of Matches");
		     int pppno=Integer.parseInt(br.readLine());
		System.out.println("Enter Player Runs:");
		     int nnname=Integer.parseInt(br.readLine());
		     System.out.println("Enter Player Wickets");
		     int ppppno=Integer.parseInt(br.readLine());
		System.out.println("Enter Player Nationality");
		     String nnnname=br.readLine();
		     System.out.println("Enter Player PowerRating");
		     int pppppno=Integer.parseInt(br.readLine());
		//team entry
		System.out.println("Team Details: ");  
		    TeamDAO ttd=new TeamDAO();
		    ttd.displayTeams();
		System.out.println("Enter Team Details: ");
		System.out.println("Enter Team ID: ");
		     int tno=Integer.parseInt(br.readLine());
		//calling player objects
		     Player t=new Player(pno,name,ppno,nname,pppno,nnname,ppppno,nnnname,pppppno,tno);
		     PlayerDAO td=new PlayerDAO();
		     td.insertPlayer(t);
		//DISPLAY PLAYER DETAILS
        PlayerDAO itd=new PlayerDAO();
	    System.out.println("***********************:Player Details:***********************");
		System.out.println("Enter Player ID: ");	     
		    int playerid=Integer.parseInt(br.readLine());
		    itd.getplayerById(playerid);       
		//Update the Player and Team
		  System.out.println("***********************:Updating Player Details:***********************");
		  System.out.println("Enter Player ID: "); 
		  int selectid=Integer.parseInt(br.readLine()); 
		  System.out.println("What You Want Update:1)Name 2)DOB 3)Skill 4)Number Of Matches 5)Runs 6)Wickets 7)Nationality 8)Power Rating 9)TeamId: 10)ReEnter All Details\n" ); 
		  int updateid=Integer.parseInt(br.readLine());
		  if(updateid==1)
		  {System.out.println("Enter Player Name:");
		  String yname=br.readLine();
		  td.updatePlayername(selectid,yname); 
		  } else if(updateid==2)
		  {System.out.println("Enter DateOfBirth() in YYYY/MM/DD"); 
		  String yppno=br.readLine(); 
		  td.updatePlayerDob(selectid,yppno); 
		  } else if(updateid==3)
		  {System.out.println("Enter Skill"); 
		  String ynname=br.readLine();
		  td.updatePlayerSkill(selectid,ynname);} 
		  else if(updateid==4)
		  {System.out.println("Enter Number Of Matches"); 
		  int ypppno=Integer.parseInt(br.readLine());
		  td.updatePlayernom(selectid,ypppno); }
		  else if(updateid==5) 
		  {System.out.println("Enter Player Runs:"); 
		  int ynnname=Integer.parseInt(br.readLine());
		  td.updatePlayerruns(selectid,ynnname);} 
		  else if(updateid==6)
		  {System.out.println("Enter Player Wickets"); 
		  int yppppno=Integer.parseInt(br.readLine());
		  td.updatePlayerwic(selectid,yppppno);}
		  else if(updateid==7)
		  {System.out.println("Enter Player Nationality"); 
		  String ynnnname=br.readLine(); 
		  td.updatePlayerNati(selectid,ynnnname);} 
		  else if(updateid==8) {System.out.println("Enter Player PowerRating"); 
		  int ypppppno=Integer.parseInt(br.readLine());
		  td.updatePlayerPower(selectid,ypppppno);} 
		  else if(updateid==9)
		  {System.out.println("Enter Team ID: ");
		  int ytno=Integer.parseInt(br.readLine());
		  td.updatePlayerTeamID(selectid,ytno); }
		  else if(updateid==10) 
		  {System.out.println("Enter Player Details: ");
		  System.out.println("Enter Player ID: ");
		  int epno=Integer.parseInt(br.readLine());
		  System.out.println("Enter Player Name:"); String ename=br.readLine();
		  System.out.println("Enter DateOfBirth() in YYYY/MM/DD"); String
		  eppno=br.readLine(); System.out.println("Enter Skill"); String
		  enname=br.readLine(); System.out.println("Enter Number Of Matches"); int
		 epppno=Integer.parseInt(br.readLine());
		  System.out.println("Enter Player Runs:"); int
		  ennname=Integer.parseInt(br.readLine());
		  System.out.println("Enter Player Wickets"); int
		  eppppno=Integer.parseInt(br.readLine());
		  System.out.println("Enter Player Nationality"); String ennnname=br.readLine();
		  System.out.println("Enter Player PowerRating"); int
		  epppppno=Integer.parseInt(br.readLine()); 
		  //team entry
		  System.out.println("Team Details: "); 
		  TeamDAO ettd=new TeamDAO();
		  ettd.displayTeams(); 
		  System.out.println("Enter Team Details: ");
		  System.out.println("Enter Team ID: "); int
		  etno=Integer.parseInt(br.readLine()); 
		  //calling player objects Player t=new
		  Player ty= new Player(epno,ename,eppno,enname,epppno,ennname,eppppno,ennnname,epppppno,etno);
		  PlayerDAO tdd=new PlayerDAO(); 
		  tdd.updatePlayer(selectid,ty); } else {
		  System.out.println("INvalid"); }
	    System.out.println("***********************: Players Details:***********************");
	    System.out.println("ID  :Name      :DOB      :Skill     :No Matches:Runs :Wickets :Nationality :skirerate :Team id  ");
		/*
		 * String format =
		 * "%s\t| %s\t| %s\t| %s\t| %s\t| %s\t| %s\t| %s\t | %s\t | %s\t | %s\t| %s";
		 * System.out.println(String.format(format, "ID", "Name", "DOB",
		 * "Skill","No Matches", "Runs", "Wickets", "Nationality ","skirerate",
		 * "Team id "));
		 */
	    PlayerDAO tdd=new PlayerDAO();
	    tdd.displayplayers();
	    //. View all players (based on Team)
	    System.out.println("***********************: Players Details(based on Team):***********************");
	    System.out.println("Enter The Team to Detail:");
	    String nnnne=br.readLine();
	    System.out.println("ID  :Name      :DOB      :Skill     :No Matches:Runs :Wickets :Nationality :skirerate :Team id  ");
	    tdd.displayplayersTeam(nnnne);
	    //. View all players (based on Team and skill)
	    System.out.println("***********************: Players Details(based on Team and skill):***********************");
	    System.out.println("Enter The Team:");
	    String iplname=br.readLine();
	    System.out.println("Enter The Skill:");
	    String iplskill=br.readLine();
	    System.out.println("ID  :Name      :DOB      :Skill     :No Matches:Runs :Wickets :Nationality :skirerate :Team id  ");
	    tdd.displayplayersTeamskill(iplname,iplskill);
	    
	}}
