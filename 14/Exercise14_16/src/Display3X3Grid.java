import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Display3X3Grid extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane stackPane = new Pane();

        for (int i = 1; i <= 2; i++) {
            Line l1 = new Line();
            l1.startYProperty().bind(stackPane.heightProperty().divide(3).multiply(i));
            l1.endXProperty().bind(stackPane.widthProperty());
            l1.endYProperty().bind(stackPane.heightProperty().divide(3).multiply(i));
            Line l2 = new Line();
            l2.startXProperty().bind(stackPane.widthProperty().divide(3).multiply(i));
            l2.endXProperty().bind(stackPane.widthProperty().divide(3).multiply(i));
            l2.endYProperty().bind(stackPane.heightProperty());

            l2.setStroke(Color.RED);
            l1.setStroke(Color.BLUE);
            stackPane.getChildren().addAll(l1,l2);
        }

        Scene scene = new Scene(stackPane, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
