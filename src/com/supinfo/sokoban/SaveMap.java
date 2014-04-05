package com.supinfo.sokoban;

/*
Exemple d'utilisation de la classe SaveMap

Plateau test = new Plateau();
SaveMap saveTest = new SaveMap(test);
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.supinfo.sokoban.unused.Plateau;

public class SaveMap {
	
	public SaveMap(Plateau map){
		
				try{
					FileOutputStream fileout = new FileOutputStream(map.getNomPlateau()+".sok"); //As the name of the level is in Plateau.nomPlateau we just need to add ".sok" to it.
					ObjectOutputStream out = new ObjectOutputStream(fileout);
					out.writeObject(map);
					out.close();
					fileout.close();
					//System.out.printf("finished");
				}catch(IOException i)
			      {
			          i.printStackTrace();
			      }
			}
}
