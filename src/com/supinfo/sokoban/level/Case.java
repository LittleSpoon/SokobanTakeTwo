package com.supinfo.sokoban.level;

public class Case implements java.io.Serializable{
	
	//Attributs
	
	private static final long serialVersionUID = 101L;	
	private int abscisse;		//deux int indiquant l'abscisse et l'ordonnee de la case 
	private int ordonnee;
	
	//Constructors
	
	public Case(){
		abscisse = 0;
		ordonnee = 0;
	}
	
	public Case(int x, int y){
		abscisse = x;
		ordonnee = y;
	}
	
	//Methods
	
	@Override
	public String toString(){
		return "T";
	}
	

}
