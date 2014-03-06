package com.supinfo.sokoban;

public class Plateau implements java.io.Serializable {
								/**
	 * 
	 */
	private static final long serialVersionUID = 1000L;
								//ATTRIBUTS

	private int hauteurPlateau;
	private int largeurPlateau;
	private int nb_cibles;	
	private String nomPlateau;
	private Case plateau[][];
	private int coordX;
	private int coordY;
	private String contenu;
	private int cible;
		
								//CONSTRUCTEUR
	
	public Plateau(){
		hauteurPlateau = 8;
		largeurPlateau = 8;
		coordX=0;
		coordY=0;
		contenu=" ";
		nb_cibles =1;
		cible=0;
		nomPlateau="temp";
		
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
	
	//Methode pour afficher le tableau
	public void afficherPlateau(){
		
		for( int i =0; i < largeurPlateau; i++){
			for( int j =0; j < hauteurPlateau; j++ ){
				plateau[i][j].afficherContenu();
			}
			System.out.println();
		}
	}
	
	//Modifier le contenu d'une case
	
	public void setPlateauCase(int coordX, int coordY, String contenu, int cible){
		plateau[coordX][coordY].setContenu(contenu);
		plateau[coordX][coordY].setCible(cible);
	}
	
							//GETTERS ET SETTERS
	

	public int getHauteurPlateau() {
		return hauteurPlateau;
	}

	public void setHauteurPlateau(int hauteurPlateau) {
		this.hauteurPlateau = hauteurPlateau;
	}

	public int getNb_cibles() {
		return nb_cibles;
	}

	public void setNb_cibles(int nb_cibles) {
		this.nb_cibles = nb_cibles;
	}
	
	public String getNomPlateau() {
		return nomPlateau;
	}

	public void setNomPlateau(String nomPlateau) {
		this.nomPlateau = nomPlateau;
	}

	public int getLargeurPlateau() {
		return largeurPlateau;
	}

	public void setLargeurPlateau(int largeurPlateau) {
		this.largeurPlateau = largeurPlateau;
	}

	public Case[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public int getCible() {
		return cible;
	}

	public void setCible(int cible) {
		this.cible = cible;
	}

}


