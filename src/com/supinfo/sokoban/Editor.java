package com.supinfo.sokoban;

import java.util.Scanner;

public class Editor {
	
	

	// lignes que l'utilisateur va  entrer
	String ligne1= new String ();
	String ligne2= new String ();
	String ligne3= new String ();
	String ligne4= new String ();
	String ligne5= new String ();
	String ligne6= new String ();
	String ligne7= new String ();
	String ligne8= new String ();

  
	  
 
		 
	 
 
	

	
	
	
	
	
	
	
   public Editor() {
	   
	// Sera egale a 1 une fois la ligne bien valider 	   
	int l=0;
	
		System.out.println("Bienvenu dans l'editeur");
		System.out.println("Creation du niveau");
		Scanner sc = new Scanner(System.in);
	
		// Saisi de la  Première ligne 
		do 
		{ 
			System.out.print("Saisir  ligne1:");
			String ligne1 = sc.nextLine();
		
			 if (ligne1.length()==8)
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
		
		//Saisi de la Deuxième ligne
		do 
		{ 
			System.out.print("Saisir ligne2:");
			String ligne2 = sc.nextLine();
		
			 if (ligne2.length()==8)
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
		
		
		
        //Saisi de la Troisième ligne
		do 
		{ 
			System.out.print("Saisir ligne3:");
			String ligne3 = sc.nextLine();
		
			 if (ligne3.length()==8)
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
		
		
        //Saisi de la Quatrième ligne
		do 
		{ 
			System.out.print("Saisir  ligne4:");
			String ligne4 = sc.nextLine();
		
			 if (ligne4.length()==8)
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
		
        // Saisi de la Cinquième ligne 
		do  
		{ 
			System.out.print("Saisir ligne5:");
			String ligne5 = sc.nextLine();
		
			 if (ligne5.length()==8)
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
		
        //Saisi de la Sixième ligne
		do 
		{ 
			System.out.print("Saisir  ligne6:");
			String ligne6 = sc.nextLine();
		
			 if (ligne6.length()==8)
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
		
        //Saisi de la Septième ligne 
		do 
		{ 
			System.out.print("Saisir  ligne7:");
			String ligne7 = sc.nextLine();
		
			 if (ligne7.length()==8)
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
		
        //Saisi de la Huitième ligne
		do 
		{ 
			System.out.print("Saisir  ligne8:");
			String ligne8 = sc.nextLine();
		
			 if (ligne8.length()==8)
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
		sc.close();
		
		
		
	
	}

}
