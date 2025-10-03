package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int NBR_CAGES = 25;
    private final Animal[] animals;
    private String name;
    private String city;
    private int count;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.count = 0;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty()) ? "DefaultZoo" : name;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public int getCount() { return count; }

    public boolean addAnimal(Animal animal) {
        if (isZooFull() || searchAnimal(animal) != -1) return false;
        animals[count++] = animal;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animaux du Zoo " + name + ":");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + animals[i]);
        }
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

    public boolean isZooFull() {
        return count >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.count >= z2.count) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", animaux=" + count + "]";
    }
}
