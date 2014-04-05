package com.supinfo.sokoban.level;

public class Box extends Case {
	
	private static final long serialVersionUID = 10L;

	public Box() {
		// TODO Auto-generated constructor stub
	}

	public Box(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return "B";
	}
}
