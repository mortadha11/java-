package tn.esprit.gestionemployes;

import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.services.DepartementHashSet;

public class MainDepartement {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "IT", 50);
        Departement d2 = new Departement(2, "RH", 20);
        Departement d3 = new Departement(3, "Finance", 15);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        System.out.println("📌 Liste des départements :");
        gestion.displayDepartement();

        System.out.println("\n🔍 Recherche 'IT' : " + gestion.rechercherDepartement("IT"));

        System.out.println("\n📂 Tri par ID :");
        System.out.println(gestion.trierDepartementById());
    }
}
