package com.supinfo.sokoban;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadMap {
	
	private Plateau map;

	public LoadMap(String mapName){
		
		Plateau map = null;
		
		try
	      {
	         FileInputStream fileIn = new FileInputStream(mapName+".sok");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         map = (Plateau) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Plateau class not found");
	         c.printStackTrace();
	         return;
	      }
	}
	
	public Plateau getMap() {
		return map;
	}
}
