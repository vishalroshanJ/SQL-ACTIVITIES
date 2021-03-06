package com.ltts.Model;

public class Player {
	
	private int id;
	private String name;
	private int tid;
	public Player(int id, String name, int tid) {
		super();
		this.id = id;
		this.name = name;
		this.tid = tid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player() {
		super();
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Playerid=" + id + "\nName=" + name;
	}

}
