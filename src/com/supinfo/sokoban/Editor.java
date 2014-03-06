package com.supinfo.sokoban;

import java.util.Scanner;

public class Editor {

	// lignes que l'utilisateur va entrer
	String ligne;
	int cible = 0;
	private Plateau plateau;
	Character t;
	int nbJoueur;
	int nbCibles;

	public Editor() {

		ligne = new String();
		plateau = new Plateau();
		nbCibles=0;

		// Sera egale a 1 une fois la ligne bien valider
		int l = 0;

		System.out.println("Bienvenu dans l'editeur");
		System.out.println("Creation du niveau");
		Scanner sc = new Scanner(System.in);

		// Saisi de la Première ligne
		for (int x = 0; x < 8; x++) {
			do {
				System.out.print("Saisir  ligne:");
				ligne = sc.nextLine();

				if (ligne.length() == 8) {

					l = 1;

				}

				else {
					System.out
							.println("la ligne doit contenir 8 caracteres max");
				}
			}

			while (l != 1);

			l = 0;

			for (int y = 0; y < 8; y++) {
				t = Character.valueOf(ligne.charAt(y));
				

				if (t.toString().equals("O")){
					cible = 1;
					nbCibles++;
				}
				plateau.setPlateauCase(x, y, t.toString(), cible);
				cible = 0;
			}
			
			 

		}
		
		 System.out.println("Donner un nom a votre map");
		 ligne = sc.nextLine();
		 plateau.setNomPlateau(ligne);
		 plateau.setNb_cibles(nbCibles);
		 
		 SaveMap saveMap = new SaveMap(plateau);
		sc.close();
		
		

		plateau.afficherPlateau();

	}

}
