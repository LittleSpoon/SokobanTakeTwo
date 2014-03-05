package com.supinfo.sokoban;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
