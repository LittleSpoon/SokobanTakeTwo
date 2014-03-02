package com.supinfo.sokoban;

public class Main {

	public static void main(String[] args) {

		Case[][] map = new Case[8][8];
		
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j] = new Case();
			}
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j].afficherContenu();
			}
		}
		

	}

}
