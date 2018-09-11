import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RotateARectangle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(30);
        rectangle.setHeight(60);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        Button button = new Button("Rotate");
        button.setOnAction(event -> {
            rectangle.setRotate(rectangle.getRotate() + 15);
        });

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(rectangle);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(stackPane);
        borderPane.setBottom(button);
        BorderPane.setAlignment(button, Pos.CENTER);

        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
