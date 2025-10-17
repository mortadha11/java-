package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial() {
        super();
    }

    public Terrestrial(String family, String name, int age, boolean mammal, int nbrLegs) {
        super(family, name, age, mammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() { return nbrLegs; }
    public void setNbrLegs(int nbrLegs) { this.nbrLegs = Math.max(nbrLegs, 0); }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs + "]";
    }
}
