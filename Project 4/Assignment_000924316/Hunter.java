package Assignment_000924316;
/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 15 / 03 / 2024
 *
 * @author vanshul Vanshul
 **/

public class Hunter extends Human {
    // Constructor for Hunter
    public Hunter(String name, int strength, int agility, int health, boolean healer, boolean hunter, int magic) {
        super(name, strength, agility, health, healer, hunter, magic);
    }

    // Constructor for Hunter with random magic rating
    public Hunter(String name, boolean healer, boolean hunter) {
        super(name, healer, hunter);
    }
}
