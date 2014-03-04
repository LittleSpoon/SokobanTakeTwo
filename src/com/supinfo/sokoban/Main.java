package com.supinfo.sokoban;

public class Main {

	public static void main(String[] args) {
		String arg1 = null;
		String arg2 = null;
		
		if(args.length>=2){
     	 	arg1=args[0];
      		arg2=args[1];
   		}
   		
   		//Si --level est égale à 0 alors il n'y a pas d'argument)
   		//di le premier arg = level ou creat
		if(arg1 != null && arg1=="--level"){
			System.out.println("Test fonctionnement");
			
			if(arg2=="niv1"){
				System.out.println("Test fonctionnement");
				// Action 
			}else if(arg2=="creat"){
				System.out.println("Test fonctionnement");
			}
		}
		
		//////////////////////////////// 		
		Case[][] map = new Case[8][8];
		
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j] = new Case();
			}
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j].afficherContenu();
			}
		}
		

	}

}
