package com.supinfo.sokoban;

import java.io.FileReader ;
import java.io.FileWriter ;
import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedWriter;


public class score {
	
	private int j;
	private int tableauScore[];
	private String path;
	private String text;
		
		public Score(){
			j = 0;
			tableauScrore[] = null;
			String path = null;
			String text = null;
		}
	
		public void EntryAndWriteScore(){
	
		while(getScore!=0){ 
			tableauScore[j] = getScore ;
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