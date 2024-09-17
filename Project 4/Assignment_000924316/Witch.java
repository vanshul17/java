package Assignment_000924316;

/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 15 / 03 / 2024
 *
 * @author vanshul Vanshul
 **/

public class Witch extends Inhabitant {
    private String pack; // Pack of the werewolf they belong to (if any)

    // Constructors for Witch
    public Witch(String name, int strength, int agility, int health, String pack) {
        super(name, strength, agility, health);
        this.pack = pack;
        // Ensure minimum attribute values for witches
        if (agility < 5 || health < 5) {
            this.agility = Math.max(this.agility, 5);
            this.health = Math.max(this.health, 5);
        }
    }

    public Witch(String name, String pack) {
        super(name);
        this.pack = pack;
        // Ensure minimum attribute values for witches
        if (agility < 5 || health < 5) {
            this.agility = Math.max(this.agility, 5);
            this.health = Math.max(this.health, 5);
        }
    }

    // Method to calculate damage inflicted by a witch
    @Override
    public int calculateDamage() {
        return (strength + agility + health) / 3;
    }

    // Method for a witch to defend against an attack
    @Override
    public void defend(int damage) {
        // Implement defense mechanism
    }

    // Method for a witch to heal another inhabitant
    @Override
    public void heal(Inhabitant target) {
        // Witches cannot heal
    }

    // Method for a witch to strengthen another inhabitant
    @Override
    public void strengthen(Inhabitant target) {
        // Implement strengthening mechanism
    }
}
