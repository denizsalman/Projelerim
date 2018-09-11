import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DisplayCheckerboard extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle();
                rectangle.setWidth(30);
                rectangle.setHeight(30);
                if (count % 2 == 0)
                    rectangle.setFill(Color.WHITE);
                else
                    rectangle.setFill(Color.BLACK);
                gridPane.add(rectangle, j, i);
                count++;
            }
            count++;
        }
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
