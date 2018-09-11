import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsideAPolygon extends Application {
    Polygon polygon = new Polygon(40, 20, 70, 40,
            60, 80, 45, 45, 20, 60);

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        pane.getChildren().add(polygon);

        Text text = new Text();
        pane.setOnMouseMoved(event -> {
            text.setText("Mouse point is " +
                    (polygon.contains(event.getX(), event.getY()) ? "inside" : "outside")
            + " the polygon");
            text.setX(event.getX());
            text.setY(event.getY());
        });
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
