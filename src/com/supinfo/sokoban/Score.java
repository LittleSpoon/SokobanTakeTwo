package com.supinfo.sokoban;

import java.io.FileReader ;
import java.io.FileWriter ;
import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.PrintWriter;


public class Score {
	
	//public FileWriter(String fileName);
	
	//Utiliser un tableau pour écrire les scrores
	//méthode écrire score fichier
	//méthode lire score fichier
	
	public void EntryAndWriteScore(){
		int j=0;
		int score=(Integer) null;
		int tableauScore[] = null;
	
	while(score!=0){
		tableauScore[j]= score;
		j++;
	}
	
	for(int i = 0; i < tableauScore.length; i++)
	{
	  System.out.println("Le score " + i +" est " + tableauScore[i]);
	}
	
		File f = new File(fichier);
		try
		{
			FileWriter fw = new FileWriter(f);
			
			for(double d : tableauScore)
			{
				fw.write(String.valueOf(d));
				fw.write("\r\n");
			}
			fw.close();
		}
		catch (IOException a)
		{
			System.out.println("Problème d'IO");
		}
	
	

	}
}