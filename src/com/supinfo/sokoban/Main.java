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
			//on libère la mémoire allouée à la map ainsi on peut choisir de nouvelles dimensions au besoin
			//Pour charger le niveau suivant par exemple :
			
			for(int i =0; i < largeurMap ; i++){
				for(int j = 0; j < hauteurMap; j++){
					map[i][j] = null;
				}
			}
				map =null;
				
				
				//Preuve à l'appui :
				
				System.out.println("level 2");
				
				map = new Case[10][20];
				
				for(int i = 0; i < 10 ; i++){
					for(int j =0; j < 20; j++){
						map[i][j] = new Case();
					}
				}
				
				for(int i = 0; i < 10; i++){
					for(int j =0; j < 20; j++){
						map[i][j].afficherContenu();
						if(j == 19)
							System.out.println();
					}
				}
		}
}
