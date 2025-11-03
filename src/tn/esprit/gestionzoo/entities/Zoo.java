package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int NBR_CAGES = 25;
    private final Animal[] animals;
    private final Aquatic[] aquaticAnimals; // ✅ nouveau tableau
    private String name;
    private String city;
    private int count;
    private int aquaticCount;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[10];
        this.count = 0;
        this.aquaticCount = 0;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty()) ? "DefaultZoo" : name;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    // === Animaux généraux ===
    public boolean addAnimal(Animal animal) {
        if (isZooFull() || searchAnimal(animal) != -1) return false;
        animals[count++] = animal;
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < count; i++) {
            if (animals[i].getName().equals(animal.getName())) return i;
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;
        for (int i = index; i < count - 1; i++) animals[i] = animals[i + 1];
        animals[--count] = null;
        return true;
    }

    public boolean isZooFull() { return count >= NBR_CAGES; }

    // === Aquatic management ===
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
        } else {
            System.out.println("Cannot add more aquatic animals.");
        }
    }

    public void displayAquaticSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // ✅ Max penguin depth
    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (penguin.getSwimmingDepth() > max) {
                    max = penguin.getSwimmingDepth();
                }
            }
        }
        return max;
    }

    // ✅ Display number of each type
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
            if (aquaticAnimals[i] instanceof Penguin) penguins++;
        }
        System.out.println("Number of Dolphins: " + dolphins);
        System.out.println("Number of Penguins: " + penguins);
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", animaux=" + count +
                ", aquaticAnimals=" + aquaticCount + "]";
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.count >= z2.count) ? z1 : z2;
    }
}
