import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javafx.scene.control.Button;

public class MoveTheBall extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(20, 20,20);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        double movingLength = 5;
        Pane pane = new Pane();
        pane.getChildren().addAll(circle);
        HBox hBox = new HBox(10);
        Button btLeft = new Button("Left");
        btLeft.setOnAction(event -> {
            if (circle.getCenterX() > circle.getRadius()) {
                circle.setCenterX(circle.getCenterX() - movingLength);
            }
        });
        Button btRight = new Button("Right");
        btRight.setOnAction(event -> {
            if (circle.getCenterX() < pane.getWidth() - circle.getRadius()) {
                circle.setCenterX(circle.getCenterX() + movingLength);
            }
        });
        Button btUp = new Button("Up");
        btUp.setOnAction(event -> {
            if (circle.getCenterY() > circle.getRadius()) {
                circle.setCenterY(circle.getCenterY() - movingLength);
            }
        });
        Button btDown = new Button("Down");
        btDown.setOnAction(event -> {
            if (circle.getCenterY() < pane.getHeight() - circle.getRadius()) {
                circle.setCenterY(circle.getCenterY() + movingLength);
            }
        });

        hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene = new Scene(borderPane, 250, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
