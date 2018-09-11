import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlAMovingText extends Application {
    private Text text = new Text("Programming is Fun");
    private double w = 200;
    private double h = 100;
    private double x = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.getChildren().addAll(text);

        text.setY(h / 2);


        EventHandler<ActionEvent> eventEventHandler = event -> {
            if (x == w)
                x = 0;
            text.setX(x++);

        };

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(40),eventEventHandler)
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        Scene scene = new Scene(pane, w, h);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
