package Assignment_000924316;

import java.util.Random;
/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 15 / 03 / 2024
 *
 * @author vanshul Vanshul
 **/

public class Human extends Inhabitant {
    private  boolean healer;
    private boolean hunter;
    public int magic; // Magic rating for healers

    // Constructors for Human
    public Human(String name, int strength, int agility, int health, boolean healer, boolean hunter, int magic) {
        super(name, strength, agility, health);
        this.healer = healer;
        this.hunter = hunter;
        this.magic = magic;
    }

    public Human(String name, boolean healer, boolean hunter) {
        super(name);
        this.healer = healer;
        this.hunter = hunter;
        this.magic = new Random().nextInt(10) + 1;
    }

    // Method to calculate damage inflicted by a human
    @Override
    public int calculateDamage() {
        return (strength + agility + health) / 3;
    }

    // Method for a human to defend against an attack
    @Override
    public void defend(int damage) {
        // Implement defense mechanism
    }

    // Method for a human to heal another inhabitant
    @Override
    public void heal(Inhabitant target) {
        // Implement healing mechanism
    }

    // Method for a human to strengthen another inhabitant
    @Override
    public void strengthen(Inhabitant target) {
        // Humans cannot strengthen other inhabitants
    }
}
