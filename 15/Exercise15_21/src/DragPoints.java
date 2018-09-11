import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class DragPoints extends Application {
  private Circle circle1 = createRandomCircle();
    private Circle circle2 = createRandomCircle();
    private Circle circle3 = createRandomCircle();
    private Line line1 = new Line();
    private Line line2 = new Line();
    private Line line3 = new Line();
    private Text text1 = new Text();
    private Text text2 = new Text();
    private Text text3 = new Text();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        pane.getChildren().addAll(circle1, circle2, circle3,
                line1, line2, line3, text1, text2, text3);

        bindTextAndCircle(text1, circle1);
        bindTextAndCircle(text2, circle2);
        bindTextAndCircle(text3, circle3);

        bindLineAndCircle(line1, circle1, circle2);
        bindLineAndCircle(line2, circle1, circle3);
        bindLineAndCircle(line3, circle2, circle3);

        circle1.setOnMouseDragged(event -> {
            circle1.setCenterX(event.getX());
            circle1.setCenterY(event.getY());
            calculateAngelsAndPrint();
        });

        circle2.setOnMouseDragged(event -> {
            circle2.setCenterX(event.getX());
            circle2.setCenterY(event.getY());
            calculateAngelsAndPrint();
        });

        circle3.setOnMouseDragged(event -> {
            circle3.setCenterX(event.getX());
            circle3.setCenterY(event.getY());
            calculateAngelsAndPrint();
        });

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void bindLineAndCircle(Line line, Circle c1, Circle c2) {
        line.startXProperty().bind(c1.centerXProperty());
        line.startYProperty().bind(c1.centerYProperty());
        line.endXProperty().bind(c2.centerXProperty());
        line.endYProperty().bind(c2.centerYProperty());
    }

    public void bindTextAndCircle(Text text, Circle circle) {
        text.xProperty().bind(circle.centerXProperty());
        text.yProperty().bind(circle.centerYProperty().subtract(circle.getRadius() - 2));
    }

    public Circle createRandomCircle() {
        return new Circle(Math.random() * 250, Math.random() *250, 10);
    }


    public void calculateAngelsAndPrint() {
        double a = new Point2D(line3.getStartX(), line3.getStartY()).
                distance(line3.getEndX(), line3.getEndY());
        double b = new Point2D(line2.getStartX(), line2.getStartY()).
                distance(line2.getEndX(), line2.getEndY());
        double c = new Point2D(line1.getStartX(), line1.getStartY()).
                distance(line1.getEndX(), line1.getEndY());

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (- 2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (- 2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (- 2 * a * b)));
        System.out.println(A);
        text1.setText(String.format("%.2f",A));
        text2.setText(String.format("%.2f",B));
        text3.setText(String.format("%.2f",C));

    }
}
