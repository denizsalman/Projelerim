import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Display54Cards extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        int count = 1;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                String s ="file:card/" + count + ".png";
                gridPane.add(new ImageView(s), j, i);

                count++;
            }
        }
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
