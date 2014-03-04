package com.supinfo.sokoban;

public class Main {

	public static void main(String[] args) {

		String level = null;

		if (args.length >= 1) {
		
			if (args[0].equals("--create")) {
				
				Editor sokobanedit = new Editor();
				
			} else if (args[0].equals("--score")) {
				
				Score sokobanscore = new Score();
				
			} else if (args[0].equals("--level")) {
				
				if (args.length >= 2) {
					
					level = args[1];
					Play sokoban = new Play(level);
					
				} else {
					
					Play sokoban = new Play();
					
				}
			}
			
		} else {

			Play sokoban = new Play();
			
		}
		
	}
	
}
