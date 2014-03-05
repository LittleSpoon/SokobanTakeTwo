package com.supinfo.sokoban;

public class Plateau {
								//ATTRIBUTS
	int hauteurPlateau;
	int largeurPlateau;
	int nb_cibles;
	int nb_caisses;
	Case  plateau[][];
	
	
	
								//CONSTRUCTEUR
	
	Plateau(){
		hauteurPlateau = 8;
		largeurPlateau = 8;
		
		plateau = new Case[largeurPlateau][hauteurPlateau];
		
		for(int i = 0; i < largeurPlateau; i++) {
			
			for(int j =0; j < hauteurPlateau; j++) {
				plateau[i][j] = new Case();
			}
		}
	}
	
							//METHODE
	
	//La méthode changerTaillePlateau permet de changer la taille du plateau lors d'un changement de niveau par exemple :
	public void changerTaillePlateau(int nlleHauteur, int nlleLargeur){
		
		//On commence par libérer l'espace précédement alloué a notre plateau de case :
		for(int i = 0; i < largeurPlateau; i++) {
			
			for(int j =0; j < hauteurPlateau; j++) {
				plateau[i][j] = null;
			}
		}
		
		plateau =null;
		
		//L'on lui attribue ensuite un nouvel espace mémoire afin de changer sa taille :
		
		plateau = new Case [nlleLargeur][nlleHauteur];
		
		for(int i = 0; i < nlleLargeur ; i++){
			for( int j =0 ; j < nlleHauteur ; j++){
				plateau[i][j] = new Case();
			}
		}
	}

}
