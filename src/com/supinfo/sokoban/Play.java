package com.supinfo.sokoban;

public class Play {
	
						//ATTRIBUT
	private int largeurMap; 
	private int hauteurMap;
	private int nb_cibles;
	private int nb_caissesRangees;
	private int score = 0;
	private Plateau  plateau;
	private Joueur player ;
	
						//CONSTRUCTEURS
	
	//Constructeur par defaut
	Play(){
		
		plateau = new Plateau();
		nb_cibles = 1;
		nb_caissesRangees =0;
		
		player = new Joueur(plateau.getPlateau(), largeurMap, hauteurMap);
	}
	
	//constructeur surchargé :
	
	Play(String level){
		
		//chargerNiveau(level)
		
		
		/*for(int i =0; i < largeurMap; i++){
			for(int j = 0; j < hauteurMap; j++){
				map[i][j] = new Case();
			}
		}*/
	}
	
	
						// METHODES
	
	
	
	public void changerNiveau(String level){		//méthode permettant de changer un niveau à partir d'un fichier
		//largeurMap = level.largeurMap;
		//hauteurMap = level.hauteurMap;
		//nb_cible = level.nb_cible;
	}
	
	public void afficherMap(){
		
		plateau.afficherPlateau();
	}
	
	//La méthode jouer devra etre appelée dans le main elle permet de faire tourner le jeu
	public void jouer(){
		
		boolean victoire = false;
		
		//On boucle tant que l'utilisateur n'a pas gagné : 
		do{
			
			afficherMap(); //On affiche la map
			
			//player.setDirectionJoueur( SAISIE CLAVIER );
			
			player.deplacerJoueur(plateau.getPlateau());		//on déplace le joueur sur la map
			chercherCaissesRangees(plateau.getPlateau());		//On cherche les caisse déjà rangées
			if(nb_caissesRangees == nb_cibles){		//si toutes les caisses sont rangées on à gagné 
				victoire = true;
			}
			
		}
		while(victoire == false); 	//On sort de la boucle si les conditions de victoire sont remplies
	}
	
	public void chercherCaissesRangees(Case map[][]){
		
		for(int i =0 ; i < largeurMap; i++){
			for( int j =0; j < hauteurMap; j++){
				if(map[i][j].getContenu() == "B" && map[i][j].getCible() ==1){
					nb_caissesRangees++;
				}
			}
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

	public int getNb_cibles() {
		return nb_cibles;
	}

	public void setNb_cibles(int nb_cibles) {
		this.nb_cibles = nb_cibles;
	}

}
