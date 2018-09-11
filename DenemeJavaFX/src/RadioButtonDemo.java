import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo {
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setStyle("-fx-border-color: green; -fx-border-width: 2");
        paneForRadioButtons.setPadding(new Insets(5));

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbBlue = new RadioButton("Blue");
        RadioButton rbGreen = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);

        rbRed.setOnAction(event -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });

        rbGreen.setOnAction(event -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });

        rbBlue.setOnAction(event -> {
            if (rbBlue.isSelected()) {
                text.setFill(Color.BLUE);
            }
        });

        paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
        pane.setLeft(paneForRadioButtons);

        return pane;
    }
}
