package tn.esprit.gestionemployes;

import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.services.AffectationHashMap;

public class MainAffectation {

    public static void main(String[] args) {

        AffectationHashMap aff = new AffectationHashMap();

        Employe e1 = new Employe(1, "Ali", "Ben Salem", "IT", 3);
        Employe e2 = new Employe(2, "Sami", "Trabelsi", "RH", 2);
        Employe e3 = new Employe(3, "Mouna", "Bennour", "Finance", 4);

        Departement d1 = new Departement(10, "IT", 50);
        Departement d2 = new Departement(20, "RH", 20);

        // Instruction 2 : Ajout
        aff.ajouterEmployeDepartement(e1, d1);
        aff.ajouterEmployeDepartement(e2, d2);
        aff.ajouterEmployeDepartement(e3, d1);

        // Instruction 3
        System.out.println("📌 Liste des affectations :");
        aff.afficherEmployesEtDepartements();

        // Tester ajout déjà existant
        System.out.println("\n⚠ Test : Affecter e1 à un autre département :");
        aff.ajouterEmployeDepartement(e1, d2);  // remplace le département précédent
        aff.afficherEmployesEtDepartements();
        // → Tu remarqueras que e1 est maintenant dans d2

        // Suppression
        System.out.println("\n❌ Suppression de e2 :");
        aff.supprimerEmploye(e2);
        aff.afficherEmployesEtDepartements();

        // Tri
        System.out.println("\n📂 Tri par ID employé :");
        System.out.println(aff.trierMap());
    }
}
