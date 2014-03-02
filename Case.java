package com.supinfo.sokoban;

public class Case {
	
	int abscisse;
	int ordonnee;
	String contenu;
	
	public Case(){
		abscisse =0;
		ordonnee = 0;
		contenu = "*";
	}
	
	public Case(int x, int y, String contenuCase){
		abscisse = x;
		ordonnee = y;
		contenu = contenuCase;
		
	}
	public  void afficherContenu(){
		
		System.out.print(contenu);
		
	}

}
