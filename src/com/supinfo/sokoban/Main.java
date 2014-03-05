package com.supinfo.sokoban;

public class Main {

	public static void main(String[] args) {
		
		
		//Parse the arguments from the console.

		if (args.length >= 1) { 						//Test if there is an argument
		
			if (args[0].equals("--create")) {			//Test if the argument equal --create and launch Editor.
				
				Editor sokobanedit = new Editor();
				
			} else if (args[0].equals("--score")) {		//Test if the argument equal --score and launch the Score
				
				Score sokobanscore = new Score();
				
			} else if (args[0].equals("--level")) {		//Test if the argument equal --level, and load the level with the second argument if there is one
				
				if (args.length >= 2) {
					
					Play sokoban = new Play(args[1]);
					
				} else {
					
					//If the --level argument is used without a second argument it launch the default level.
					
					Play sokoban = new Play();
					
				}
			}
			
		} else {

			Play sokoban = new Play();
			
		}
		
		
		
		
		
		

		
	}
	
}
