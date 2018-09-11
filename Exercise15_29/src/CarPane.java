import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class CarPane extends Pane {
    private Circle circle1 = new Circle(5);
    private Circle circle2 = new Circle(5);
    private Polygon polygon = new Polygon();
    private Timeline animation;
    private double locationX, locationY;
    private double w, h;
    private double speed = 1;

    public CarPane() {
        w = 500;
        h = 100;
        locationX = 0;
        locationY = h;

        setPrefSize(w, h);

        animation = new Timeline(
                new KeyFrame(Duration.millis(50), event -> moveCar())
        );
        animation.setCycleCount(Timeline.INDEFINITE);

        animation.play();

    }

    public void increaseSpeed() {
        animation.setRate(speed);
        speed += 0.1;
    }

    public void decreaseSpeed() {
        animation.setRate(speed);
        if (speed > 0)
            speed -= 0.1;
    }

    public void pause() {
        animation.pause();
    }

    public void play() {
        animation.play();
    }

    public void moveCar() {
        if (locationX == w)
            locationX = 0;
        paintCar(locationX, locationY);
        locationX++;
    }

    public void paintCar(double x, double y) {
        getChildren().clear();
        polygon.getPoints().clear();
        circle1.setCenterX(x + 15);
        circle1.setCenterY(y - 5);
        circle2.setCenterX(x + 35);
        circle2.setCenterY(y - 5);

        polygon.getPoints().addAll(x, y -10,
                x, y - 20, x + 10, y - 20, x + 20, y - 30,
                x + 30, y - 30, x + 40, y - 20, x + 50,
                y - 20, x + 50, y - 10);
        getChildren().addAll(circle1, circle2, polygon);
    }

}
