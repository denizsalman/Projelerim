import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class DrawLinesUsingTheArrowKeys extends Application {
    Polyline polygon = new Polyline();
    ObservableList<Double> list = polygon.getPoints();
    double x;
    double y;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefWidth(250);
        pane.setPrefHeight(250);
        x = 125;
        y = 125;
        pane.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.UP) {
                y -= 10;
            } else if (event.getCode() == KeyCode.DOWN) {
                y += 10;
            } else if (event.getCode() == KeyCode.LEFT) {
                x -= 10;
            } else if (event.getCode() == KeyCode.RIGHT) {
                x += 10;
            }
            list.add(x);
            list.add(y);
        });

        pane.getChildren().add(polygon);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }
}
