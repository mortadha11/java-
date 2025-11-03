package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String family, String name, int age, boolean mammal, String habitat) {
        super(family, name, age, mammal);
        this.habitat = habitat;
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }


    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic other)) return false;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }
}
