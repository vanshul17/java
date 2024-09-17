package Assignment_000924316;
/**
 * This is the class header. Put a brief description of your
 * program here, and the date it was created. 15 / 03 / 2024
 *
 * @author vanshul Vanshul
 **/


public class Main {
    public static void main(String[] args) {
        // Create instances of each inhabitant type
        Inhabitant werewolf = new Werewolf("Werewolf1", "Pack1", true);
        Inhabitant witch = new Witch("Witch1", "Pack2");
        Inhabitant human = new Human("Human1", true, false);
        Inhabitant healer = new Healer("Healer1", true, false);
        Inhabitant hunter = new Hunter("Hunter1", false, true);

        // Output their details using toString() method
        System.out.println(werewolf);
        System.out.println(witch);
        System.out.println(human);
        System.out.println(healer);
        System.out.println(hunter);

        // Example of calling methods and using the inhabitant's behavior
        if (werewolf.isAlive()) {
            // Example of attacking another inhabitant
            int damage = werewolf.calculateDamage();
            System.out.println("Werewolf attacks with damage: " + damage);

            // Example of defending against an attack
            werewolf.defend(damage);
            System.out.println("After defending, Werewolf's health: " + werewolf.health);

            // Example of healing another inhabitant
            werewolf.heal(human);
            System.out.println("Werewolf cannot heal");
        }

        if (witch.isAlive()) {
            // Example of strengthening another inhabitant
            witch.strengthen(healer);
            System.out.println("Witch strengthens Healer, Healer's magic: " + ((Healer) healer).getMagic());
        }
    }
}
