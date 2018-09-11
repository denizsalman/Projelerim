import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoCircleDistance extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle1 = new Circle(15);
        circle1.setCenterX(200);
        circle1.setCenterY(50);
        Circle circle2 = new Circle(15);
        circle2.setCenterX(100);
        circle2.setCenterY(150);

        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(),
                circle2.getCenterX(), circle2.getCenterY());

        Pane pane = new Pane();
        double distance = Math.hypot(circle1.getCenterX() - circle2.getCenterX(),
                circle1.getCenterY() - circle2.getCenterY());
        Text text = new Text(distance + "");
        double textX = (circle1.getCenterX() + circle2.getCenterX()) / 2;
        double textY = (circle1.getCenterY() + circle2.getCenterY()) / 2;
        text.setX(textX);
        text.setY(textY);

        pane.getChildren().addAll(circle1, circle2, line, text);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
