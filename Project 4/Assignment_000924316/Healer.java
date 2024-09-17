package Assignment_000924316;
/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 15 / 03 / 2024
 *
 * @author vanshul Vanshul
 **/


public class Healer extends Human {
    // Constructor for Healer
    public Healer(String name, int strength, int agility, int health, boolean healer, boolean hunter, int magic) {
        super(name, strength, agility, health, healer, hunter, magic);
    }

    // Constructor for Healer with random magic rating
    public Healer(String name, boolean healer, boolean hunter) {
        super(name, healer, hunter);
    }

    // Getter method for magic rating
    public int getMagic() {
        return magic;
    }
}

