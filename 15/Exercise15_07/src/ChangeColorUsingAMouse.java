import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorUsingAMouse extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setOnMousePressed(event -> {
            circle.setFill(Color.BLACK);
        });
        circle.setOnMouseReleased(event -> circle.setFill(Color.WHITE));
        StackPane stackPane = new StackPane(circle);

        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
