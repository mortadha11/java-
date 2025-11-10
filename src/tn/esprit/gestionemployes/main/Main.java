package tn.esprit.gestionemployes;


import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.services.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Ben Salem", "IT", 3);
        Employe e2 = new Employe(2, "Sami", "Trabelsi", "RH", 2);
        Employe e3 = new Employe(3, "Mouna", "Bennour", "IT", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println(" Liste des employés :");
        societe.displayEmploye();

        System.out.println("\n Recherche de 'Ali' : " + societe.rechercherEmploye("Ali"));

        System.out.println("\n Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n Tri par Département et Grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n Suppression de Sami...");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();
    }
}
