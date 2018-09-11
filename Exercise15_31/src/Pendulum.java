import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Pendulum extends Application {
    private Circle circle = new Circle(10);
    private double w = 200;
    private double h = 200;
    private Arc arc = new Arc(w / 2, 20, w * 0.8, w * 0.8,
            240, 60);
    private Line line = new Line();
    private Timeline animation;
    private double currentAngle = 0;
    private double direction = 0.1;
    private double speed = 1;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        arc.setType(ArcType.OPEN);
        arc.setFill(null);


        line.startXProperty().bind(arc.centerXProperty());
        line.setStartY(20);
        line.endXProperty().bind(circle.centerXProperty());
        line.endYProperty().bind(circle.centerYProperty());

        pane.setOnKeyPressed(event -> {

            switch (event.getCode()){
                case UP:animation.setRate(++speed);break;
                case DOWN:if (speed > 0)
                    animation.setRate(--speed);
                break;
                case S:animation.stop();break;
                case R:animation.play();break;
            }

        });


        animation = new Timeline(
                new KeyFrame(Duration.millis(5), event -> moveCircle())
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        pane.getChildren().addAll(circle, arc, line);

        Scene scene = new Scene(pane, w, h);
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();

    }

    public void moveCircle() {
        circle.setCenterX(arc.getCenterX() + arc.getRadiusX() * Math.cos(Math.toRadians(
                arc.getStartAngle() + currentAngle)));
        circle.setCenterY(arc.getCenterY() - arc.getRadiusX() * Math.sin(Math.toRadians(
                arc.getStartAngle() + currentAngle)));
        currentAngle += direction;
        if (currentAngle > 60 || currentAngle < 0)
            direction *= -1;

    }

}
