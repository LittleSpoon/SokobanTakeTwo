package com.supinfo.sokoban;

public class Joueur {
						
	
						//ATTRIBUTS :
	private int score;
	private int x;
	private int y;
	private String directionJoueur;
	
						
	
						//CONSTRUCTEUR
	
	Joueur(Case map[][], int largeurMap, int hauteurMap, int x_joueur, int y_joueur){
		score = 0;
		x = x_joueur;
		y = y_joueur;
		directionJoueur = "DROITE";
		
	}
						//METHODES :
	public void deplacerCaisse(Case map[][]){
		
		switch(directionJoueur){
			case "HAUT":
				//Si la case du dessus contient une caisse
				if(map[x][y-1].getContenu() == "B"){
					//...et que la case au au dessus de celle ci est vide ou contient un espace de stokage
					if((map[x][y-2].getContenu() == " ") || (map[x][y-2].getContenu() == "O")){
						map[x][y-2].setContenu("B");	//...On indique que la case contient desormais une caisse.
					}
				}
				break;
			
			case "BAS":
				if(map[x][y+1].getContenu() == "B"){
					if((map[x][y+2].getContenu() == " ") || (map[x][y+2].getContenu() == "O")){
						map[x][y+2].setContenu("B");
					}
				}
				break;
			
			case "GAUCHE":
				if(map[x-1][y].getContenu() == "B"){
					if((map[x-2][y].getContenu() == " ") || (map[x-2][y].getContenu() == "O")){
						map[x-2][y].setContenu("B");
					}
				}
				break;
			
			case "DROITE":
				if(map[x+1][y].getContenu() == "B"){
					if((map[x+2][y].getContenu() == " ") || (map[x+2][y].getContenu() == "O")){
						map[x+2][y].setContenu("B");
					}
				}
				break;
		}
	}
	
	public void deplacerJoueur(Case map[][]){
		
		if(gestionCollision(map) == true){	//Si on à le droit de se déplacer  
		
		switch(directionJoueur){
			
				case "HAUT":
					deplacerCaisse(map);
					if(map[x][y].getCible() == 0){	//Si la case ou l'on se trouve n'est pas un espace de stockage...
						map[x][y].setContenu(" ");	//...le contenu de la case sera un espace vide.
					}
					else{
						map[x][y].setContenu("O");	//...Autrement si c'est un espace de stockage le contneu de la case sera un espace de stokage
					}
					y--;
					map[x][y].setContenu("X");	//enfin on déplace le joueur et on change le contenu de la case afin qu'elle contienne le joueur
					break;
			
				case "BAS":
					deplacerCaisse(map);
					if(map[x][y].getCible() == 0){
						map[x][y].setContenu(" ");
					}
					else{
						map[x][y].setContenu("O");
					}
					y++;
					map[x][y].setContenu("X");
					break;
			
				case "GAUCHE":
					deplacerCaisse(map);
					if(map[x][y].getCible() == 0){
						map[x][y].setContenu(" ");
					}
					else{
						map[x][y].setContenu("O");
					}
					x--;
					map[x][y].setContenu("X");

					break;
			
				case "DROITE":
					deplacerCaisse(map);
					if(map[x][y].getCible() == 0){
						map[x][y].setContenu(" ");
					}
					else{
						map[x][y].setContenu("O");
					}
					x++;
					map[x][y].setContenu("X");
					break;
			
				default :
					break;
			}
		}
		
	}
	
	public boolean gestionCollision(Case map[][]){
		
		boolean ok = false;
		
		switch(directionJoueur){	//On teste la direction du joueur grâce a un switch
		
			case "HAUT" :
				//On teste le contenu de la case au dessus du joueur :
				
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
				//On teste le contenu de la case en dessus du joueur :
				switch(map[x][y+1].getContenu()){
					case " ":
						ok =true;
						break;
					
					case "B":
						if((map[x][y+2].getContenu() == " ") || (map[x][y+2].getContenu() == "O"))
							ok =true;
						else 
							ok =false; //S'il y a une caisse ou un mur derrière la caisse on interdit le deplacement;
						break;
					
					case "=":	
						ok =false; //s'il y a un mur on interdit le déplacement
						break;
					
					case "O":		//si la case est un espace de stockage ou peut déplacer le joueur vers le bas
						ok = true;
						break;
					
					default :
						break;
				}
				break;
			
			case "GAUCHE" :
				//On teste le contenu de la case à gauche du joueur :
				switch(map[x-1][y].getContenu()){
					case " ":
						ok = true;	//si la case de gauche est vide on peut se déplacer
						break;
					
					case "B" :	//si la case de gauche contient une caisse...
						if((map[x-2][y].getContenu() == " ") || (map[x-2][y].getContenu() == "O")) 
							ok =true;	//....et que la case derriere celle ci est vide ou contient un espace de stockage, on peut se déplacer. 
						else
							ok =false;	//Sinon on interdit le déplacement.
						break;
					
					case "=":
						ok = false;		//Si la case de gauche est un mur on interdit le déplacement
						break;
					
					case "O":
						ok =true;	//Si la case de gauchte est un espace de stockage on peut se déplacer
						break;
					
					default:
						break;
				}
				break;
			
			case "DROITE" :
				//On teste le contenu de la case à droite du joueur :
				switch(map[x+1][y].getContenu()){
					
					case " ":
						ok =true;	//Si la case de droite ne contient rien on peut se déplacer.
						break;
					
					case "B":	//Si la case de droite contient une caisse...
						if((map[x+2][y].getContenu() == " ") || (map[x+2][y].getContenu() == "O")) 
							ok = true;//...et que la case derrière celle-ci est vide ou contient un espace de stockage, on peut se déplacer
						else
							ok = false; //Autrement on interdit le déplacement.
						break;
						
					case "=":
						ok = false;	//Si la case de droite contient un mur , on interdit le déplacement.
						break;
						
					case "O":
						ok =true;	//si la case de droite contient un espace de stockage, on peut se déplacer. 
						break;
						
					default:
						break;
				}
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
