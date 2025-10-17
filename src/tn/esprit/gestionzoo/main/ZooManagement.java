package tn.esprit.gestionzoo.main;
//package tn.esprit.gestionzoo;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    private static String[] args;

    public static void main(String[] args) {
        ZooManagement.args = args;
        Aquatic aquatic = new Aquatic("Fish", "GenericFish", 2, false, "Sea");
        Terrestrial terrestrial = new Terrestrial("Mammal", "Lion", 5, true, 4);
        Dolphin dolphin = new Dolphin("Delphinidae", "Dolphin", 8, true, "Ocean", 35.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Penguin", 3, false, "Antarctic", 100f);

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        System.out.println("\n--- Swimming test ---");
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
