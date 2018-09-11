import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BounceBallControl extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        BallPane ballPane = new BallPane();

        ballPane.setOnMousePressed(event -> ballPane.pause());
        ballPane.setOnMouseReleased(event -> ballPane.play());
        ballPane.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.UP) {
                ballPane.increaseSpeed();
            } else if (event.getCode() == KeyCode.DOWN) {
                ballPane.decreaseSpeed();
            }
        });

        Scene scene = new Scene(ballPane, 250, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

        ballPane.requestFocus();
    }
}
