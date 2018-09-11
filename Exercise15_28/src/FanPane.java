import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class FanPane extends Pane {
    private Circle circle = new Circle();
    Timeline animation;
    private double w = 100;
    private double h = 100;
    private double angle = 0;
    private static final int ROTATE_LEFT = 1;
    private static final int ROTATE_RIGHT = -1;
    private int direction = 1;
    Line line = new Line();

    public FanPane() {
        paintFanPane();
    }

    public void paintFanPane() {
        circle.setCenterX(w / 2);
        circle.setCenterY(h / 2);
        circle.setRadius(Math.min(w, h) / 2);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);

        EventHandler<ActionEvent> eventHandler = event -> {
            getChildren().clear();
            getChildren().add(circle);
            for (int i = 0; i < 4; i++) {
                Arc arc = new Arc(w / 2, h / 2, w / 2, h / 2,
                        i * 90 + angle, 30);
                arc.setType(ArcType.ROUND);
                getChildren().addAll(arc);
            }
            if (direction == 1)
                angle++;
            else if (direction == -1)
                angle--;
            System.out.println(angle);
        };

        animation = new Timeline(
                new KeyFrame(Duration.millis(50), eventHandler)
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        setMaxSize(w, h); // Eğer max size belirlemezsek pane boyutu otomatik olarak büyüyor.

    }


    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }

    public void reverse() {
        if (direction ==  ROTATE_LEFT)
            direction = ROTATE_RIGHT;
        else
            direction = ROTATE_LEFT;
    }
}
