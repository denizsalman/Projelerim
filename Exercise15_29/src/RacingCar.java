import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RacingCar extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        CarPane carPane = new CarPane();
        pane.getChildren().add(carPane);

        pane.setOnMousePressed(event -> carPane.pause());
        pane.setOnMouseReleased(event -> carPane.play());

        pane.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.UP) {
                carPane.increaseSpeed();
            } else if (event.getCode() == KeyCode.DOWN) {
                carPane.decreaseSpeed();
            }

        });

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

}
