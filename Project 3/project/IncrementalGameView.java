package assignment_000924316;
/**
 * This is the class header. Put a brief description of your
 *  program here, and the date it was created. jan 24, 2024
 * @author vanshul vanshul
 */

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class IncrementalGameView extends Application {
    private IncrementalGameModel model;
    private Label totalItemsLabel;
    private Button clickButton;
    private Button upgradeButton;
    private Label messageLabel;
    private StackPane itemsPane;
    private StackPane deductedItemsPane;

    @Override
    public void start(Stage primaryStage) {
        model = new IncrementalGameModel();

        totalItemsLabel = new Label("Total Items: " + model.getTotalItems());
        clickButton = createStyledButton("Click");
        upgradeButton = createStyledButton("Upgrade (Cost: " + model.getUpgradeCost() + ")");
        messageLabel = new Label("");
        itemsPane = new StackPane();
        deductedItemsPane = new StackPane();

        clickButton.setOnAction(event -> {
            model.click();
            updateView();
            applyClickEffect();
            showMessage("+1");
            updateItemsPane();
        });

        upgradeButton.setOnAction(event -> {
            model.purchaseUpgrade();
            updateView();
            showMessage("Upgrade -" + model.getUpgradeCost());
            updateItemsPane();
        });

        VBox root = new VBox(10);
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(clickButton, upgradeButton);
        root.getChildren().addAll(totalItemsLabel, buttonBox, messageLabel);

        // Create a VBox to contain both itemsPane and deductedItemsPane
        VBox itemsContainer = new VBox(10, itemsPane, deductedItemsPane);
        root.getChildren().add(itemsContainer);

        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("Incremental Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        updateView(); // Initial update
    }

    private Button createStyledButton(String text) {
        Button button = new Button(text);
        button.setStyle("-fx-font-size: 14; -fx-background-color: #4CAF50; -fx-text-fill: white;");
        button.setOnMouseEntered(e -> button.setEffect(new DropShadow()));
        button.setOnMouseExited(e -> button.setEffect(null));
        return button;
    }

    private void updateView() {
        totalItemsLabel.setText("Total Items: " + model.getTotalItems());
        upgradeButton.setText("Upgrade (Cost: " + model.getUpgradeCost() + ")");
    }

    private void applyClickEffect() {
        clickButton.setEffect(new DropShadow());
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        clickButton.setEffect(null);
                    }
                },
                200
        );
    }

    private void showMessage(String message) {
        messageLabel.setText(message);

        FadeTransition fadeOut = new FadeTransition(Duration.millis(2000), messageLabel);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.play();
    }

    private void updateItemsPane() {
        itemsPane.getChildren().clear();
        deductedItemsPane.getChildren().clear();

        int totalItems = model.getTotalItems();
        for (int i = 0; i < totalItems; i++) {
            Circle circle = new Circle(15, Color.GOLD); // Adjust radius and color as needed
            itemsPane.getChildren().add(circle);
            FadeTransition fadeOut = new FadeTransition(Duration.millis(2000), itemsPane);
            fadeOut.setFromValue(1.0);
            fadeOut.setToValue(0.0);
            fadeOut.play();
        }

        // Show deducted amount graphically only when the upgrade button is clicked
        if (model.isUpgradePurchased()) {
            int deductedAmount = model.getUpgradeCost();
            for (int i = 0; i < deductedAmount; i++) {
                Circle deductedCircle = new Circle(15, Color.RED); // Adjust radius and color as needed
                deductedItemsPane.getChildren().add(deductedCircle);

                FadeTransition fadeOut = new FadeTransition(Duration.millis(2000), deductedItemsPane);
                fadeOut.setFromValue(1.0);
                fadeOut.setToValue(0.0);
                fadeOut.play();
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
