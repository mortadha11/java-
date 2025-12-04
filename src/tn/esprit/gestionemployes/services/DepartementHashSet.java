package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.interfaces.IDepartement;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class DepartementHashSet implements IDepartement<Departement> {

    private Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void displayDepartement() {
        for (Departement d : departements)
            System.out.println(d);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> ts = new TreeSet<>(
                (a, b) -> Integer.compare(a.getId(), b.getId())
        );
        ts.addAll(departements);
        return ts;
    }
}
