package com.supinfo.sokoban;

public class Main {

	public static void main(String[] args) {
		
		/*
		//Parse the arguments from the console.

		if (args.length >= 1) {
		
			if (args[0].equals("--create")) {
				
				Editor sokobanedit = new Editor();
				
			} else if (args[0].equals("--score")) {
				
				Score sokobanscore = new Score();
				
			} else if (args[0].equals("--level")) {
				
				if (args.length >= 2) {
					
					Play sokoban = new Play(args[1]);
					
				} else {
					
					//If the --level argument is used without a second argument it launch the default level.
					
					Play sokoban = new Play();
					
				}
			}
			
		} else {

			Play sokoban = new Play();
			
		}*/
		
		Plateau test = new Plateau();
		test.setPlateauCase(3, 2, "*");
		test.setPlateauCase(2,1,"*");
		
		SaveMap saveTest = new SaveMap(test);

		
	}
	
}
