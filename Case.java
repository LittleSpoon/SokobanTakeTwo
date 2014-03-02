package com.supinfo.sokoban;

public class Case {
	
	int abscisse;
	int ordonnee;
	String contenu;
	
	Case(){
		abscisse =0;
		ordonnee = 0;
		contenu = "*";
	}
	
	Case(int x, int y, String contenuCase){
		abscisse = x;
		ordonnee = y;
		contenu = contenuCase;
		
	}
	public void afficherContenu(){
		
		System.console().printf(contenu);
	}

}
