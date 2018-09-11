import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsideARectangle extends Application {
    Rectangle rectangle = new Rectangle(100, 60, 100, 40);
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().add(rectangle);

        Text text = new Text();
        pane.setOnMouseMoved(event -> {
            text.setText("Mouse point is " +
                    (rectangle.contains(event.getX(), event.getY()) ? "inside" : "outside")
                    + " the rectangle" );
            text.setX(event.getX());
            text.setY(event.getY());
        });
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
