package com.supinfo.sokoban.level;

public class Plateau implements java.io.Serializable{
	
	//Attributs
	private static final long serialVersionUID = 1002L;
	private int hauteurPlateau;
	private int largeurPlateau;
	private int nb_cibles;	
	private String nomPlateau;
	private Case plateau[][];
	private String contenuePlateau;

	public Plateau() {
		// TODO Auto-generated constructor stub
		hauteurPlateau = 8;
		largeurPlateau = 8;
		nomPlateau="temp";
		contenuePlateau="";
		plateau = new Case[largeurPlateau][hauteurPlateau];
		for(int i = 0; i < largeurPlateau; i++) {
			for(int j =0; j < hauteurPlateau; j++) {
				plateau[i][j] = new Case();
			}
		}
	}
	
	@Override
	public String toString(){
		contenuePlateau="";
		for( int i =0; i < largeurPlateau; i++){
			for( int j =0; j < hauteurPlateau; j++ ){
				contenuePlateau.concat(plateau[i][j].toString());
			}
		}
		
		return contenuePlateau;
	}

}
