package com.supinfo.sokoban;

public class Play {
	
						//ATTRIBUT
	int largeurMap; 
	int hauteurMap;
	int nb_cible;
	int nb_caisse;
	
	
	Case [][]map = new Case[largeurMap][hauteurMap];
	Joueur player ;
	
						//CONSTRUCTEUR
	Play(){
		
		largeurMap = 8;
		hauteurMap = 8;
		nb_cible = 1;
		nb_caisse = 1;
		
		for(int i =0; i < largeurMap; i++){
			for(int j = 0; j < hauteurMap; j++){
				map[i][j] = new Case();
			}
		}
		
		player = new Joueur(map, largeurMap, hauteurMap);
		
		
	}
	
	Play(String level){
		
		//chargerNiveau(level)
		
		
		/*for(int i =0; i < largeurMap; i++){
			for(int j = 0; j < hauteurMap; j++){
				map[i][j] = new Case();
			}
		}*/
	}
						// METHODES
	
	public void chargerNiveau(String level){
		//largeurMap = level.largeurMap;
		//hauteurMap = level.hauteurMap;
		//nb_cible = level.nb_cible;
		//nb_caisse = level.nb_caisse;
	}
	
	public void afficherMap(){
		
		for( int i =0; i < largeurMap; i++){
			for( int j =0; j < hauteurMap; j++ ){
				map[i][j].afficherContenu();
				
				player.deplacerJoueur(player.getDirectionJoueur(),map);
			}
			System.out.println();
		}
	}
	
	
						// GETTER ET SETTER
	public int getLargeurMap() {
		return largeurMap;
	}

	public void setLargeurMap(int largeurMap) {
		this.largeurMap = largeurMap;
	}

	public int getHauteurMap() {
		return hauteurMap;
	}

	public void setHauteurMap(int hauteurMap) {
		this.hauteurMap = hauteurMap;
	}

	public int getNb_cible() {
		return nb_cible;
	}

	public void setNb_cible(int nb_cible) {
		this.nb_cible = nb_cible;
	}

	public int getNb_caisse() {
		return nb_caisse;
	}

	public void setNb_caisse(int nb_caisse) {
		this.nb_caisse = nb_caisse;
	}
}
