package Assignment_000924316;

import java.util.Random;

/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 15 / 03 / 2024
 *
 * @author vanshul Vanshul
 **/


public abstract class Inhabitant {
    protected String name;
    protected int strength;
    protected int agility;
    protected int health;
    protected boolean alive;

    // Constructor with all attributes specified
    public Inhabitant(String name, int strength, int agility, int health) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.health = health;
        this.alive = health > 0;
    }

    // Constructor with only name specified, randomly generates other attributes
    public Inhabitant(String name) {
        this.name = name;
        Random random = new Random();
        this.strength = random.nextInt(10) + 1;
        this.agility = random.nextInt(10) + 1;
        this.health = random.nextInt(10) + 1;
        this.alive = true;
    }

    // Method to check if an inhabitant is alive
    public boolean isAlive() {
        return alive;
    }

    // Method to calculate damage inflicted by an inhabitant
    public abstract int calculateDamage();

    // Method to defend against an attack
    public abstract void defend(int damage);

    // Method to heal another inhabitant
    public abstract void heal(Inhabitant target);

    // Method to strengthen another inhabitant (for witches)
    public abstract void strengthen(Inhabitant target);

    @Override
    public String toString() {
        return "Name: " + name + ", Alive: " + alive + ", Strength: " + strength +
                ", Agility: " + agility + ", Health: " + health;
    }
}
