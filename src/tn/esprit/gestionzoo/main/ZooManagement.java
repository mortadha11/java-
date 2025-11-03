package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exception.ZooFullException;
import tn.esprit.gestionzoo.exception.InvalidAgeException;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Belvedere Zoo", "Tunis");

        System.out.println("=== Testing addAnimal with exceptions (Prosit 7) ===");
        try {
            zoo.addAnimal(new Animal("Felidae", "Lion", 5, true));
            System.out.println("Number of animals after add: " + zoo.getCount());

            zoo.addAnimal(new Animal("Cercopithecidae", "Monkey", 3, true));
            System.out.println("Number of animals after add: " + zoo.getCount());

            // ❌ Invalid age test
            zoo.addAnimal(new Animal("Elephantidae", "Elephant", -2, true));
            System.out.println("Number of animals after add: " + zoo.getCount());

            // ❌ Zoo full test (max 3 cages)
            zoo.addAnimal(new Animal("Giraffidae", "Giraffe", 7, true));
            System.out.println("Number of animals after add: " + zoo.getCount());

        } catch (ZooFullException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.err.println("Invalid age: " + e.getMessage());
        }

        // === Prosit 6: Aquatic animals ===
        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 8, true, "Ocean", 35.5f);
        Dolphin d2 = new Dolphin("Delphinidae", "Splash", 5, true, "Sea", 28.2f);
        Penguin p1 = new Penguin("Spheniscidae", "Pingo", 3, false, "Antarctic", 100f);
        Penguin p2 = new Penguin("Spheniscidae", "Snowy", 2, false, "Arctic", 120f);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        System.out.println("\n=== All aquatic animals swimming ===");
        zoo.displayAquaticSwim();

        System.out.println("\n=== Max penguin swimming depth ===");
        System.out.println("Max depth: " + zoo.maxPenguinSwimmingDepth() + " m");

        System.out.println("\n=== Aquatic animals by type ===");
        zoo.displayNumberOfAquaticsByType();
    }
}
