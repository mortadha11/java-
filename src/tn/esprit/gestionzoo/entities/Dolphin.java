package tn.esprit.gestionzoo.entities;

public class Dolphin extends tn.esprit.gestionzoo.entities.Aquatic {
    private float swimmingSpeed;

    public Dolphin() {
        super();
    }

    public Dolphin(String family, String name, int age, boolean mammal, String habitat, float swimmingSpeed) {
        super(family, name, age, mammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() { return swimmingSpeed; }
    public void setSwimmingSpeed(float swimmingSpeed) { this.swimmingSpeed = Math.max(swimmingSpeed, 0); }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed + "]";
    }
}
