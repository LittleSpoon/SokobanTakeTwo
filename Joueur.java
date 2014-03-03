package com.supinfo.sokoban;

public class Joueur {
						
	
						//ATTRIBUTS :
	int score;
	int x;
	int y;
	String directionJoueur;
	Case map[][];
						
	
						//METHODES :
	
	public void deplacerJoueur(String direction){
		
		//if(gestionCollision == ok) :
		
		switch(direction){
			
			case "HAUT":
				y--;
				break;
			
			case "BAS":
				y++;
				break;
			
			case "GAUCHE":
				x--;
				break;
			
			case "DROITE":
				x++;
				break;
			
			default :
				break;
		}
		
	}
	
	public boolean gestionCollision(String DirectionJoueur){
		
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

}
