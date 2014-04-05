package com.supinfo.sokoban.level;

public class Plateau implements java.io.Serializable{
	
	//Attributs
	private static final long serialVersionUID = 1002L;
	private int ordonneePlateau;
	private int abscissePlateau;
	private int nb_cibles;	
	private String nomPlateau;
	private Case plateau[][];
	private String contenuePlateau;
	private int x_joueur;
	private int y_joueur;
	
	

	public Plateau() {
		// TODO Auto-generated constructor stub
		ordonneePlateau = 8;
		abscissePlateau = 8;
		nomPlateau="temp";
		contenuePlateau=null;
		x_joueur = 1;
		y_joueur = 1;
		plateau = new Case[abscissePlateau][ordonneePlateau];
		for(int x = 0; x < abscissePlateau; x++) {
			for(int y =0; y < ordonneePlateau; y++) {
				plateau[x][y] = new Case(x, y, false);
			}
		}
	}
	
	@Override
	public String toString(){
		contenuePlateau="";
		for( int x =0; x < abscissePlateau; x++){
			for( int y =0; y < ordonneePlateau; y++ ){
				contenuePlateau = contenuePlateau + plateau[x][y].toString();
			}
		}
		
		return contenuePlateau;
	}
	
	public void testCastingCaseToPlayer(){
		plateau[1][1] = new Player();
	}
	
	public void testCastingPlayertoCase(){
		plateau[1][1] = new Case();
	}
	
	public void setPlateauCase(int coordX, int coordY, String contenu, boolean cible){
		switch (contenu){
		case "X": 
			plateau[coordX][coordY] = new Player(coordX,coordY,cible);
			break;
		case "B":
			plateau[coordX][coordY] = new Box(coordX,coordY,cible);
			break;
		case "=":
			plateau[coordX][coordY] = new Wall(coordX,coordY);
			break;
		case " ":
			plateau[coordX][coordY] = new Case(coordX,coordY,cible);
			break;
		default:
			break;
		
		}
		 
	}

}
