package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        Zoo zoo1 = new Zoo("Belvedere Zoo", "Tunis");
        Zoo zoo2 = new Zoo("Safari Zoo", "Sousse");

        System.out.println("Ajout Lion: " + zoo1.addAnimal(lion));
        System.out.println("Ajout Tiger: " + zoo1.addAnimal(tiger));
        System.out.println("Ajout Lion encore: " + zoo1.addAnimal(lion));

        zoo1.displayAnimals();

        System.out.println("Chercher Lion: " + zoo1.searchAnimal(lion));
        Animal lion2 = new Animal("Felidae", "Lion", 6, true);
        System.out.println("Chercher un autre Lion identique: " + zoo1.searchAnimal(lion2));

        System.out.println("Suppression du Tiger: " + zoo1.removeAnimal(tiger));
        zoo1.displayAnimals();

        zoo2.addAnimal(elephant);
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est: " + plusGrand.getName());
    }
}
