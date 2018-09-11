import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveACircleUsingKeys extends Application {
    Circle circle = new Circle(20, 20, 20);
    double movingLength = 10;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.setOnKeyPressed(event -> {

            switch (event.getCode()) {
                case UP:
                    if (circle.getCenterY() > circle.getRadius()) {
                    circle.setCenterY(circle.getCenterY() - movingLength);
                }; break;
                case DOWN:
                    if (circle.getCenterY() < pane.getHeight() - circle.getRadius()) {
                        circle.setCenterY(circle.getCenterY() + movingLength);
                    }; break;
                case LEFT:
                    if (circle.getCenterX() > circle.getRadius()) {
                        circle.setCenterX(circle.getCenterX() - movingLength);
                    }; break;
                case RIGHT:
                    if (circle.getCenterX() < pane.getWidth() - circle.getRadius()) {
                        circle.setCenterX(circle.getCenterX() + movingLength);
                    }; break;


            }
        });

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }
}
