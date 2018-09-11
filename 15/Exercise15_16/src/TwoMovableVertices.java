import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoMovableVertices extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle c1 = new Circle(40, 40, 10);
        Circle c2 = new Circle(120, 150,10);
        c1.setStroke(Color.BLACK);
        c1.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);
        c2.setFill(Color.WHITE);

        Text text = new Text(distance(c1, c2));

        Circle[] circles = {c1, c2};
        for (Circle circle : circles) {
            circle.setOnMouseDragged(event -> {
                circle.setCenterX(event.getX());
                circle.setCenterY(event.getY());
                text.setText(distance(c1, c2));
            });
        }
        Line line = new Line();
        line.startXProperty().bind(c1.centerXProperty());
        line.startYProperty().bind(c1.centerYProperty());
        line.endXProperty().bind(c2.centerXProperty());
        line.endYProperty().bind(c2.centerYProperty());
        text.xProperty().bind(line.endXProperty().add(line.startXProperty()).divide(2));
        text.yProperty().bind(line.endYProperty().add(line.startYProperty()).divide(2));



        Pane pane = new Pane();
        pane.getChildren().add(line);
        pane.getChildren().addAll(c1, c2);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String distance(Circle c1, Circle c2) {
        Point2D point2D = new Point2D(c1.getCenterX(), c1.getCenterY());
        double s =  point2D.distance(c2.getCenterX(), c2.getCenterY());
        return String.format("%.2f", s);
    }
}
