SokobanTakeTwo
==============

Projet scolaire d'un mini Sokoban en Java. Cela doit une application cli, possédant un éditeur.

Comment m’utiliser:

Lancer le programme sans option, c’est à dire sans argument, le jeu démarre par défaut au niveau 1.

Lancer le programme avec « —-level » plus, le nom du niveau, (le fichier du niveau doit être dans le même répertoire 
que l'exécutable) le jeu démarre au niveau demandé pour l’utilisateur.
Par defaut le jeu est livré avec deux niveau: niv1.sok, et niv2.sok.

Lancer le programme avec la méthode « editor », le mode éditeur démarre.
L'editeur construit le niveau ligne par ligne. Il demande d'entrer une ligne de 8 caractères, l'enregistre, puis demande d'entrer la ligne suivante.
Lorsque les 8 lignes sont entrées il demande le nom du niveau. Ce nom sera utilisé afin d'enregistrer le niveau. Le niveau est automatiquement enregistré.
L'éditeur n'est pas encore complet, il ne teste pas donc si les caractères rentre sont valides.

Lancer le programme avec "--score" ne fait acutellement rien. La classe score est encore incomplète.
 

