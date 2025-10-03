package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean mammal;

    public Animal(String family, String name, int age, boolean mammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.mammal = mammal;
    }

    public String getFamily() { return family; }
    public void setFamily(String family) { this.family = family; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = Math.max(age, 0); }

    public boolean isMammal() { return mammal; }
    public void setMammal(boolean mammal) { this.mammal = mammal; }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name +
                ", age=" + age + ", mammal=" + mammal + "]";
    }
}
