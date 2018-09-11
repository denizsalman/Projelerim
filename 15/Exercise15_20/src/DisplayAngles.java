import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class DisplayAngles extends Application {
    private Pane pane = new Pane();
    //These are points for triangle
    private Circle c1 = new Circle(10);
    private Circle c2 = new Circle(10);
    private Circle c3 = new Circle(10);
    //These are sides for triangle
    private Line l1 = new Line();
    private Line l2 = new Line();
    private Line l3 = new Line();
    Circle[] circles = {c1, c2, c3};
    //These are angle values for triangle
    Text t1 = new Text();
    Text t2 = new Text();
    Text t3 = new Text();
    Text[] texts = {t1, t2, t3};
    @Override
    public void start(Stage primaryStage) throws Exception {
        setCirclesAndLineProperties();

        //Drag the vertices of the triangle
        pane.setOnMouseDragged(event -> {
            for (int i = 0; i < circles.length; i++) {
                if (circles[i].isPressed()) {
                    circles[i].setCenterX(event.getX());
                    circles[i].setCenterY(event.getY());
                    texts[i].setText(getAngleOfCircle(i));
                    texts[(i + 1) % 3].setText(getAngleOfCircle((i + 1) % 3));
                    texts[(i + 2) % 3].setText(getAngleOfCircle((i + 2) % 3));
                }
            }
        });

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void setCirclesAndLineProperties() {
        Line[] lines = {l1, l2, l3};
        //Create a random triangle and bind properties
        for (int i = 0; i < 3; i++) {
            circles[i].setCenterX(getRandomX());
            circles[i].setCenterY(getRandomY());
            texts[i].xProperty().bind(circles[i].centerXProperty());
            texts[i].yProperty().bind(circles[i].centerYProperty().
                    subtract(circles[i].radiusProperty()));
            lines[i].startXProperty().bind(circles[i].centerXProperty());
            lines[i].startYProperty().bind(circles[i].centerYProperty());
            lines[i].endXProperty().bind(circles[(i + 1) % 3].centerXProperty());
            lines[i].endYProperty().bind(circles[(i + 1) % 3].centerYProperty());
        }
        pane.getChildren().addAll(texts);
        pane.getChildren().addAll(circles);
        pane.getChildren().addAll(lines);
    }

    //This method returns a random X value
    public double getRandomX() {
        return 10 + Math.random() * 230;

    }
    //This method returns a random Y value
    public double getRandomY() {
        return 10 + Math.random() * 230;
    }
    //This method calculates angles dynamically as the triangle shape changes
    private String getAngleOfCircle(int i) {
        Point2D[] points = getPoints();
        double a = points[(i + 1) % 3].distance(points[(i + 2) % 3]);
        double b = points[i].distance(points[(i + 1) % 3]);
        double c = points[i].distance(points[(i + 2) % 3]);
        double cosA;
        cosA = (Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (-2 * b * c);
        return String.format("%.2f", Math.toDegrees(Math.acos(cosA)));

    }
    //This method returns points of triangle
    private Point2D[] getPoints() {
        Point2D[] point2DS = new Point2D[3];
        for (int i = 0; i < circles.length; i++) {
            point2DS[i] = new Point2D(circles[i].getCenterX(), circles[i].getCenterY());
        }
        return point2DS;
    }
}
