package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Belvedere Zoo", "Tunis");

        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 8, true, "Ocean", 35.5f);
        Dolphin d2 = new Dolphin("Delphinidae", "Splash", 5, true, "Sea", 28.2f);
        Penguin p1 = new Penguin("Spheniscidae", "Pingo", 3, false, "Antarctic", 100f);
        Penguin p2 = new Penguin("Spheniscidae", "Snowy", 2, false, "Arctic", 120f);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        System.out.println("=== All aquatic animals swimming ===");
        zoo.displayAquaticSwim();

        System.out.println("\n=== Max penguin swimming depth ===");
        System.out.println("Max depth: " + zoo.maxPenguinSwimmingDepth() + " m");

        System.out.println("\n=== Aquatic animals by type ===");
        zoo.displayNumberOfAquaticsByType();
    }
}
