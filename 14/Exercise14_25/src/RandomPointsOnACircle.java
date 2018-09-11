import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class RandomPointsOnACircle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        circle.setCenterX(70);
        circle.setCenterY(70);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Pane pane = new Pane();
        Polygon polygon = new Polygon();
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);
        ObservableList<Double> list = polygon.getPoints();
        double temp = 0;
        for (int i = 0; i < 5; i++) {
            double randomAngle = Math.random() * 360;
            if (randomAngle <= temp) {
                i--;
                continue;
            }
            list.add(circle.getCenterX() + Math.cos(Math.toRadians(randomAngle)) * circle.getRadius());
            list.add(circle.getCenterY() + Math.sin(Math.toRadians(randomAngle)) * circle.getRadius());
            temp = randomAngle;
        }

        pane.getChildren().addAll(circle, polygon);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
