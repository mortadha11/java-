package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.entities.Employe;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map<Employe, Departement> map = new HashMap<>();

    // Instruction 2 : Ajouter employé → département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);  // Remplace si l'employé existe déjà
    }

    // Instruction 3 : Afficher toutes les affectations
    public void afficherEmployesEtDepartements() {
        if (map.isEmpty()) {
            System.out.println("Aucune affectation !");
            return;
        }

        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }

    // Instruction 4 : Supprimer un employé
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    // Instruction 5 : Supprimer un employé d’un département particulier
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    // Instruction 6 : Afficher employés uniquement
    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7 : Afficher départements uniquement
    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }

    // Instruction 8 : Rechercher un employé
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    // Instruction 9 : Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    // Instruction 10 : Retourner une TreeMap triée par ID employé
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(
                (a, b) -> Integer.compare(a.getId(), b.getId())
        ) {{
            putAll(map);
        }};
    }
}
