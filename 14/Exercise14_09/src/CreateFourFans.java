import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreateFourFans extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                FanPane fanPane = new FanPane();
                gridPane.add(fanPane, j, i);
            }
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
