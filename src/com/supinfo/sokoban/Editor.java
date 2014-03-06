package com.supinfo.sokoban;

import java.util.Scanner;

public class Editor {
	
	

	// lignes que l'utilisateur va  entrer
	String ligne= new String ();

  
	  
 
		 
	 
 
	

	
	
	
	
	
	
	
   public Editor() {
	   
	// Sera egale a 1 une fois la ligne bien valider 	   
	int l=0;
	
		System.out.println("Bienvenu dans l'editeur");
		System.out.println("Creation du niveau");
		Scanner sc = new Scanner(System.in);
	
		// Saisi de la  Première ligne 
		for (int x=0;i<8;i++)
		{
		do 
		{ 
			System.out.print("Saisir  ligne:");
			String ligne = sc.nextLine();
		
			 if (ligne.length()==8)
			   {
				 
				 
				 l=1;
				
				}
			   
			 else
			 {
				 System.out.println("la ligne doit contenir 8 caracteres max");
			 }
			   }
		
		while (l!=1) ;
		
		l=0;
		
		for(int y=0;y<8;y++)
		{
			ligne.charAt(y)
		}
		
		}		
		sc.close();
	
	}
   


}
