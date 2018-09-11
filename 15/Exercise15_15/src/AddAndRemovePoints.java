import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AddAndRemovePoints extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        double circleRadius = 5;
        Pane pane = new Pane();
        pane.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                Circle circle = new Circle(event.getX(), event.getY(),
                        circleRadius);
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);
                pane.getChildren().add(circle);
                pane.getChildren().listIterator();
            } else {
                for (Node circle: pane.getChildren()) {
                    if (circle.contains(event.getX(), event.getY())) {
                        pane.getChildren().remove(circle);
                        break;
                    }
                }
            }
        });

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
