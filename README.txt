/*
 * Début TP1
 */

6.2) La visibilité optimale pour le a fonction isAlive() est friendly dans cette configuration, car c'est la visibilité la plus 
sécurisé tout en gardant la fonction accesible dans le main.

7.3) A l'inverse de la configuration précédente, étant donné que le main et la fonction isAlive() ne sont pas dans le même 
package, on dois modifier la visibilité de isAlive à protected pour que le main puisse toujours l'appeler.

/*
 * Fin TP1
 */

--------------------------------------------------------------

/*
 * Début TP2
 */

 1.2) getClass() agit sur la classe en cours, et getSimpleName() est une méthode de classe qui renvoie le nom de la classe. 
 Ce qui fais qu'avec un this.getClass().getSimpleName() on obtiens de le nom de la classe de l'objet courant.

 Il faudra passer les attributs de classe qui sont dans "Characters" de private à protected afin que les classe qui héritent de 
 "Characters" (comme par exemple "Hero") puisse accéder à la variable lors de la création de l'objet.
 
 6) Si on instancie l'épée au deux personnages la durabilité est décrémenté à chaque tour car ils ont le meme objet.
 
 /*
 * Fin TP2
 */

--------------------------------------------------------------
 
 /*
  * Debut TP3
  */
 
 4.2) les classes heros et monsters montrent une erreurs car la methode abstraite créer dans characters n'est pas 
 implémenter dans les sous-classes de characters.
 
 