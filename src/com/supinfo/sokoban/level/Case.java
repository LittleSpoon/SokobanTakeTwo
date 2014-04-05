package com.supinfo.sokoban.level;

public class Case implements java.io.Serializable{
	
	//Attributs
	
	private static final long serialVersionUID = 101L;	
	private int abscisse;		//deux int indiquant l'abscisse et l'ordonnee de la case 
	private int ordonnee;
	private boolean cible;
	
	//Constructors
	
	public Case(){
		abscisse = 0;
		ordonnee = 0;
		cible = false;
	}
	
	public Case(int x, int y, boolean c){
		abscisse = x;
		ordonnee = y;
		cible = c;
	}
	
	//Methods
	
	@Override
	public String toString(){
		return " ";
	}
	

}
