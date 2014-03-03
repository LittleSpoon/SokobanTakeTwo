package com.supinfo.sokoban;


public class Main {

	public static void main(String[] args) {

		int largeurMap = 8;
		int hauteurMap = 8;
		Case [][] map = new Case[largeurMap][hauteurMap];

			for(int i = 0; i < 8 ; i++){
				for(int j =0; j < 8; j++){
					map[i][j] = new Case();
				}
			}

			for(int i = 0; i < 8; i++){
				for(int j =0; j < 8; j++){
					map[i][j].afficherContenu();
					if(j == 7)
						System.out.println();
				}
			}
		}
}
