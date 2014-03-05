package com.supinfo.sokoban;

import java.io.FileReader ;
import java.io.FileWriter ;
import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedWriter;


public class score {
	
	private int j=0;
	private int tableauScore[] = null;
	private String path = null;
	private String text = null;
	
		public void EntryAndWriteScore(){
	
		while(score!=0){ //mettre le getter de play
			tableauScore[j] = null ; /// mettre le getter de play
			j++;
		}
	
		File fichier = new File ("Score");
	 
		try
		{
		    PrintWriter pw = new PrintWriter (new BufferedWriter (new FileWriter (fichier)));
	 
		    for (double d : tableauScore)
		    {
		        pw.println (d);
		    }
	 
		    pw.close();
		}
		catch (IOException exception)
		{
	  	  System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
		}
	}
	

}