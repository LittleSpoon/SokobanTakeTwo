package com.supinfo.sokoban.level;

public class Wall extends Case {

	private static final long serialVersionUID = 10L;

	public Wall() {
		// TODO Auto-generated constructor stub
	}

	public Wall(int x, int y) {
		super(x, y, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "=";
	}

}
