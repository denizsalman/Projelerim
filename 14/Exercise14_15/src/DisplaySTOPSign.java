import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplaySTOPSign extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10, 30, 10, 30));
        Polygon polygon = new Polygon();
        ObservableList<Double> list = polygon.getPoints();
        polygon.setFill(Color.RED);
        Text text = new Text("STOP");
        text.setFont(Font.font("Times New Roman", FontWeight.MEDIUM,
                FontPosture.REGULAR, 50));
        text.setFill(Color.WHITE);
        double radius = 100;
        for (int i = 0; i < 8; i++) {
            list.add(radius * Math.cos(2 * Math.PI / 8 * i + Math.PI / 8));
            list.add(radius * Math.sin(2 * Math.PI / 8 * i + Math.PI / 8));
        }
        stackPane.getChildren().add(polygon);
        stackPane.getChildren().add(text);

        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
