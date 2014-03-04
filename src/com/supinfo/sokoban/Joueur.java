package com.supinfo.sokoban;

public class Joueur {
						
	
						//ATTRIBUTS :
	int score;
	int x;
	int y;
	String directionJoueur;
	
						
	
						//CONSTRUCTEUR
	
	Joueur(Case map[][], int largeurMap, int hauteurMap){
		score = 0;
		x = 0;
		y =0;
		directionJoueur = "DROITE";
		
	}
						//METHODES :
	
	public void deplacerJoueur(String direction, Case map[][]){
		
		//if(gestionCollision == ok) :
		
		switch(direction){
			
			case "HAUT":
				map[x][y].setContenu(" ");
				y--;
				map[x][y].setContenu("X");
				break;
			
			case "BAS":
				map[x][y].setContenu(" ");
				y++;
				map[x][y].setContenu("X");
				break;
			
			case "GAUCHE":
				map[x][y].setContenu(" ");
				x--;
				map[x][y].setContenu("X");
				break;
			
			case "DROITE":
				map[x][y].setContenu(" ");
				x++;
				map[x][y].setContenu("X");
				break;
			
			default :
				break;
		}
		
	}
	
	public boolean gestionCollision(String DirectionJoueur, Case map[][]){
		
		boolean ok = false;
		switch(directionJoueur){	//On teste la direction du joueur grâce a un switch
			case "HAUT" :
				switch(map[x][y-1].getContenu()){		//On teste le contenu de la case au dessus du joueur
					case " " :
						ok = true;	//Si la case d'au dessus est vide on peut deplacer le joueur vers le haut
						break;
					
					case "B" :	//Si la case au dessus est une caisse... 
						//...Et si la case au dessus de cette caisse est vide ou correspond à une zone de stokage :
						if((map[x][y-2].getContenu() == " ") || (map[x][y-2].getContenu() == "O"))
							ok  = true;					//Alors on peut déplaçer le joueur vers le haut;
						break;
					
					case "=":	//Si la case du dessus est un mur :
						ok = false;
						break;
					
					case "O":		//Si la case au dessus du joueur est une zone de stokage
						ok = true;	//ALors on peut se déplacer vers le haut 
						break;
						
					default :
						break;
				}
				break;
			
			case "BAS" :
				//On fera comme pour la direction haut mais avec la case d'en dessous
				break;
			
			case "GAUCHE" :
				//On fera comme pour la direction haut mais avec la case à gauche
				break;
			
			case "DROITE" :
				//On fera comme pour la direction haut mais avec la case à droite
				break;
			
			default :
				break;
		}
		
		return ok;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDirectionJoueur() {
		return directionJoueur;
	}

	public void setDirectionJoueur(String directionJoueur) {
		this.directionJoueur = directionJoueur;
	}

}
