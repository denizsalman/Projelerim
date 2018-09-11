import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PaintSmileyFace extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle face = new Circle(100);
        face.setCenterX(110);
        face.setCenterY(110);
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);
        Ellipse[] eyes = new Ellipse[2];
        eyes[0] = new Ellipse(70, 70, 30, 23);
        eyes[0].setFill(Color.WHITE);
        eyes[0].setStroke(Color.BLACK);
        eyes[1] = new Ellipse(150, 70, 30, 23);
        eyes[1].setStroke(Color.BLACK);
        eyes[1].setFill(Color.WHITE);

        Circle[] circles = new Circle[2];
        circles[0] = new Circle(20);
        circles[0].setCenterX(eyes[0].getCenterX());
        circles[0].setCenterY(eyes[0].getCenterY());
        circles[1] = new Circle(20);
        circles[1].setCenterX(eyes[1].getCenterX());
        circles[1].setCenterY(eyes[1].getCenterY());

        Polygon polygon = new Polygon(face.getCenterX(), face.getCenterY() - 40,
                face.getCenterX() - 20, face.getCenterY() + 20, face.getCenterX() + 20,
                face.getCenterY() + 20);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        Arc arc = new Arc(face.getCenterX(), face.getCenterY() + 30, 50,
                20, 0, -180);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);
        pane.getChildren().addAll(face, eyes[0], eyes[1], circles[0], circles[1], polygon, arc);
        Scene scene = new Scene(pane, 220, 220);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
