package Assignment_000924316;
/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 15 / 03 / 2024
 *
 * @author vanshul Vanshul
 **/


public class Werewolf extends Inhabitant {
    private String pack;
    private boolean alpha;

    // Constructors for Werewolf
    public Werewolf(String name, int strength, int agility, int health, String pack, boolean alpha) {
        super(name, strength, agility, health);
        this.pack = pack;
        this.alpha = alpha;
        // Ensure minimum attribute values for werewolves
        if (strength < 5 || agility < 5 || health < 5) {
            this.strength = Math.max(this.strength, 5);
            this.agility = Math.max(this.agility, 5);
            this.health = Math.max(this.health, 5);
        }
    }

    public Werewolf(String name, String pack, boolean alpha) {
        super(name);
        this.pack = pack;
        this.alpha = alpha;
        // Ensure minimum attribute values for werewolves
        if (strength < 5 || agility < 5 || health < 5) {
            this.strength = Math.max(this.strength, 5);
            this.agility = Math.max(this.agility, 5);
            this.health = Math.max(this.health, 5);
        }
    }

    // Method to calculate damage inflicted by a werewolf
    @Override
    public int calculateDamage() {
        return (strength + agility + health) / 3;
    }

    // Method for a werewolf to defend against an attack
    @Override
    public void defend(int damage) {
        // Implement defense mechanism
    }

    // Method for a werewolf to heal another inhabitant
    @Override
    public void heal(Inhabitant target) {
        // Werewolves cannot heal
    }

    // Method for a witch to strengthen another inhabitant
    @Override
    public void strengthen(Inhabitant target) {
        // Werewolves cannot strengthen other inhabitants
    }
}
