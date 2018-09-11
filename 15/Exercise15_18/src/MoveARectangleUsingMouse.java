import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MoveARectangleUsingMouse extends Application {
    Rectangle rectangle = new Rectangle();
    Pane pane = new Pane();
    @Override
    public void start(Stage primaryStage) throws Exception {
        rectangle.setX(10);
        rectangle.setY(10);
        rectangle.setWidth(50);
        rectangle.setHeight(25);
        pane.getChildren().add(rectangle);

        rectangle.setOnMouseDragged(event -> {
            rectangle.setX(event.getX() - rectangle.getWidth() / 2);
            rectangle.setY(event.getY() - rectangle.getHeight() / 2);
        });

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
