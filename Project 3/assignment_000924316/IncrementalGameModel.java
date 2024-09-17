package assignment_000924316;
/**
 * This is the class header. Put a brief description of your
 *  program here, and the date it was created. jan 24, 2024
 * @author vanshul vanshul
 */

public class IncrementalGameModel {
    private int totalItems;
    private int upgradeCost;
    private boolean upgradePurchased;

    public IncrementalGameModel() {
        totalItems = 0;
        upgradeCost = 10; // Set your initial upgrade cost
        upgradePurchased = false;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void click() {
        totalItems++;
    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public boolean isUpgradePurchased() {
        return upgradePurchased;
    }

    public void purchaseUpgrade() {
        if (totalItems >= upgradeCost) {
            totalItems -= upgradeCost;
            upgradeCost += 5; // Set your upgrade cost increase
            upgradePurchased = true;
        }
    }
}
