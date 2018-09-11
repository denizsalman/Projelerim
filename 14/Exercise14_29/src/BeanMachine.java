import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class BeanMachine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        StackPane mainPane = new StackPane();
        mainPane.setPadding(new Insets(40));
        double twoPointsDistance = 20;
        double bottomLineLength = twoPointsDistance * 8;

        Polyline polyline = new Polyline(
                twoPointsDistance * 3.5, 0,
                twoPointsDistance * 3.5, twoPointsDistance * 2,
                0, twoPointsDistance * 9,
                0, twoPointsDistance * 11 ,
                bottomLineLength, twoPointsDistance * 11,
                bottomLineLength, twoPointsDistance * 9,
                twoPointsDistance * 4.5, twoPointsDistance * 2,
                twoPointsDistance * 4.5, 0
                );
        for (int i = 1; i <= 7; i++) {
            Line line = new Line(
                    twoPointsDistance * i, twoPointsDistance * 11,
                    twoPointsDistance * i, twoPointsDistance * 9
                    );
            pane.getChildren().add(line);
        }

        for (int i = 1; i <=7; i++) {
            for (int j = i; j <= 7; j++) {
                Circle circle = new Circle(twoPointsDistance * j - (twoPointsDistance / 2) * (i - 1) ,
                        twoPointsDistance * (10 - i), twoPointsDistance / 4);
                pane.getChildren().add(circle);
            }
        }

        pane.getChildren().add(polyline);
        mainPane.getChildren().add(pane);
        Scene scene = new Scene(mainPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
