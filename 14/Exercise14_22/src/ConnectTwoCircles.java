import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConnectTwoCircles extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle1 = new Circle(15);
        circle1.setCenterX(20);
        circle1.setCenterY(30);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        Text t1 = new Text("1");
        t1.setX(circle1.getCenterX());
        t1.setY(circle1.getCenterY());

        Circle circle2 = new Circle(15);
        circle2.setCenterX(100);
        circle2.setCenterY(100);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        Text t2 = new Text("2");
        t2.setX(circle2.getCenterX());
        t2.setY(circle2.getCenterY());

        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(),
                circle2.getCenterX(), circle2.getCenterY());
        Pane pane = new Pane();
        pane.getChildren().addAll(line, circle1, t1, circle2, t2);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);;
        primaryStage.show();
    }
}
