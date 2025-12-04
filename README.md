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
