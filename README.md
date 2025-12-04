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
