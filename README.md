
Voici un fichier README pour chacun des Projets (Prosit) basés sur les instructions fournies :

📚 Prosit 4 : Gestion des Entités et Encapsulation 🔒
Ce projet se concentre sur l'amélioration de la gestion des entités Animal et Zoo, en mettant l'accent sur l'encapsulation et l'organisation du code en utilisant des packages.

Instructions Principales :

Instruction 17 : Modifier la méthode addAnimal pour inclure la vérification isZooFull().


Instruction 18 : Restreindre l'accès aux attributs des classes Animal et Zoo (encapsulation) pour protéger leurs caractéristiques.

Un animal ne doit pas avoir un âge négatif.

Le nom d'un Zoo ne doit pas être vide.

Corriger les erreurs induites par ces restrictions.

Instruction 19 : Organiser le code en utilisant les packages :


tn.esprit.gestionzoo.main pour la classe principale.


tn.esprit.gestionzoo.entities pour les classes d'entités.

🐟 Prosit 5 : Héritage et Polymorphisme (Partie 1) 🐬
Ce projet introduit les concepts d'héritage pour modéliser différents types d'animaux au sein du zoo : Aquatic (Aquatiques) et Terrestrial (Terrestres).

Instructions Principales :

Instruction 20 : Créer les classes d'animaux spécialisées:


Aquatic : caractérisé par habitat (String).


Dolphin (Dauphin) : caractérisé par swimmingSpeed (float).


Penguin (Pingouin) : caractérisé par swimmingDepth (float).


Terrestrial : caractérisé par nbrLegs (int).


Instruction 21 & 22 : Créer des instances avec les constructeurs par défauts, puis implémenter des constructeurs paramétrés dans les classes filles. Protéger les attributs (encapsulation).


Instruction 23 : Redéfinir la méthode toString() dans les 3 sous-classes pour inclure les attributs communs et spécifiques.


Instruction 24 : Créer la méthode public void swim() dans Aquatic et Dolphin.


Aquatic affiche : "This aquatic animal is swimming.".


Dolphin affiche : "This dolphin is swimming.".

Tester cette méthode sur des objets de type Aquatic, Dolphin et Penguin.

🌊 Prosit 6 : Classes Abstraites et Collections (Aquatiques) 🐧
Ce projet étend la gestion du zoo en se concentrant sur les animaux aquatiques en utilisant une collection dédiée et en implémentant des concepts avancés d'héritage et de polymorphisme (classes abstraites).

Instructions Principales :

Instruction 25 & 26 : Dans la classe Zoo, créer un tableau aquaticAnimals (max 10) et la méthode public void addAquaticAnimal(Aquatic aquatic) pour y ajouter des animaux aquatiques.


Instruction 27 & 28 : Afficher la méthode swim() pour tous les animaux aquatiques. Modifier la méthode swim() dans la classe Aquatic pour qu'elle soit obligatoirement redéfinie dans toutes les classes filles.


Instruction 29 : Créer la méthode public float maxPenguinSwimmingDepth() dans la classe Zoo pour trouver la profondeur maximale de nage des pingouins.


Instruction 30 : Créer la méthode public void displayNumberOfAquaticsByType() pour afficher le nombre de dauphins et de pingouins dans le zoo.

Instruction 31 : Redéfinir la méthode equals() dans la classe Aquatic. Deux animaux aquatiques sont considérés identiques s'ils ont le même nom, le même âge et vivent dans le même habitat.

⚠️ Prosit 7 : Gestion des Exceptions Personnalisées 🛑
Ce projet aborde le mécanisme de gestion des exceptions pour assurer l'exécution normale du programme face à des circonstances exceptionnelles (comme des données incorrectes).

Instructions Principales :

Instruction 32 : Modifier le type de retour de la méthode addAnimal(Animal animal) de boolean à void et enlever les tests de vérification si le zoo est plein.


Instruction 33 : Créer une classe d'exception personnalisée ZooFullException.

La méthode addAnimal devra utiliser cette nouvelle exception.

Corriger les erreurs dans la méthode main pour que le programme affiche toujours le nombre d’animaux après chaque ajout.

Réduire le nombre de cages à 3 pour tester le code.

Instruction 34 : Interdire l'ajout d'un animal avec un âge négatif. Renvoyer l'exception levée à une classe InvalidAgeException qui va la gérer.

Corriger les erreurs dans la méthode main.

👨‍💻 Prosit 9 : Collections et Interfaces (Employé) 📜
Ce projet se concentre sur la gestion des employés d'une société tunisienne en utilisant l'interface IGestion et une implémentation basée sur ArrayList.

Entité Employé :
Un employé est caractérisé par:

Un identifiant (int)

Un nom (String)

Un prénom (String)

Un nom de département (String)

Un grade (int)

La classe Employe possède :

2 constructeurs, dont un sans paramètre.

Les méthodes Getters & Setters.

Redéfinition de equals (selon l'ID et le nom).

Redéfinition de toString.

Interface IGestion<T> :
L'interface définit les méthodes de gestion:

public void ajouterEmploye(T t);

public boolean rechercherEmploye(String nom);

public boolean rechercherEmploye(T t);

public void supprimerEmploye(T t);

public void displayEmploye();

public void trierEmployeParId(); (Utilisation de Comparable)

public void trierEmployeParNomDépartementEtGrade(); (Utilisation de Comparator)

Instruction Principale :
Créer la classe SocieteArrayList qui implémente l'interface IGestion et utilise un ArrayList pour gérer la liste des employés.

🏢 Prosit 10 : Collections et Interfaces (Département) ⚙️
Ce projet concerne la gestion des départements d'une société en utilisant l'interface IDépartement et une implémentation basée sur HashSet.

Entité Département :
Un département est caractérisé par:

Un id (int)

Un nom de département (String)

Un nombre des employés (int)

La classe Departement possède :

2 constructeurs, dont un sans paramètre.

Les méthodes Getters & Setters.

Redéfinition de equals (selon l'ID et le nom).

Redéfinition de toString.

Interface IDepartement<T> :
L'interface définit les méthodes de gestion:

public void ajouterDepartement(T t);

public boolean rechercherDepartement(String nom);

public boolean rechercherDepartement(T t);

public void supprimerDepartement(T t);

public void displayDepartement();

public TreeSet<T> trierDepartementById();

Instruction Principale :
Construire la classe DepartementHashSet qui implémente l'interface IDepartement et utilise un HashSet pour gérer la liste des départements.

🗺️ Prosit 11 : Collections (MAP) et Affectation Employé-Département 🔗
Ce projet utilise une structure de type MAP pour gérer l'affectation de chaque employé à un unique département.

Instructions Principales :
Instruction 1 : Créer la classe AffectationHashMap contenant une collection dynamique de paires Clé-Valeur (Employé-Département). Un employé ne peut être affecté qu'à un seul département. Les éléments ne sont pas triés.


Instruction 2 : Créer la méthode ajouterEmployeDepartement(Employe e, Departement d) pour effectuer l'affectation.


Instruction 3 : Développer la méthode afficherEmployesEtDepartements pour afficher l'ensemble des employés et leurs départements.

Tester l'ajout du même employé à deux départements différents et observer le résultat.


Instruction 4 : Développer la méthode supprimerEmploye(Employe e) pour supprimer un employé de la collection.


Instruction 5 : Développer la méthode supprimerEmployeEtDepartement(Employe e, Departement d) pour supprimer un employé affecté à un département spécifique.


Instruction 6 & 7 : Créer les méthodes afficherEmployes() et afficherDepartements() pour lister respectivement les employés et les départements.


Instruction 8 & 9 : Créer les méthodes boolean rechercherEmploye(Employe e) et boolean rechercherDepartement(Departement d) pour tester l'existence.


Instruction 10 : Développer la méthode TreeMap<Employe, Departement> trierMap() qui retourne une collection de type TreeMap afin de trier les employés selon leur identifiant.
