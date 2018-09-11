import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseInsideACircle extends Application {
    Circle circle = new Circle(50);
    double circleX = 100;
    double circleY = 60;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        circle.setCenterX(circleX);
        circle.setCenterY(circleY);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);


        Text text = new Text();

        pane.setOnMouseMoved(event -> {
            text.setText("Mouse point is " +
                    (circle.contains(event.getX(), event.getY()) ? "inside" : "outside" )+ " the circle");
            text.setX(event.getX());
            text.setY(event.getY());
        });

        pane.getChildren().add(circle);
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
