package com.supinfo.sokoban.level;

public class Player extends Case {
	
	private static final long serialVersionUID = 10L;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return "X";
	}

}
