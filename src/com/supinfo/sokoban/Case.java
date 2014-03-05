package com.supinfo.sokoban;



public class Case {
	
	
						//SECTION ATTRIBUTS 
	
	
	private int abscisse;		//deux int indiquant l'abscisse et l'ordonnée de la case 
	private int ordonnee;
	private String contenu;		//un string qui indiquera ce que contiendra la case (joueur , caisse , mur....)
	private int cible;
	
	//Constructeur par défaut de la classe Case :
	public Case(){
		abscisse =0;
		ordonnee = 0;
		contenu = " ";
		cible = 0;
	}
	
	//Constructeur "surchargé  :
	public Case(int x, int y, String contenuCase){
		abscisse = x;
		ordonnee = y;
		contenu = contenuCase;
		
	}
	
	
						//SECTION METHODES :
	
	
	
	//Méthode permettant d'afficher le contenu de la case :
	
	public  void afficherContenu(){
		
			System.out.print(contenu);
	}
	
	
						//SECTION GETTER ET SETTER :
	
	
	//Getter de l'abscisse de la case :
	
	public int getAbscisse() {
		return abscisse;
	}
	
	//Setter de l'abscisse de la case :
	
	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}
	
	//Getter de l'ordonnée de la case :
	
	public int getOrdonnee() {
		return ordonnee;
	}
	
	//Setter de l'ordonnée de la case :
	
	public void setOrdonnee(int ordonnee) {
		this.ordonnee = ordonnee;
	}
	
	//Getter du contenu de la case :
	
	public String getContenu() {
		return contenu;
	}
	
	//Setter du contenu de la case :
	
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
