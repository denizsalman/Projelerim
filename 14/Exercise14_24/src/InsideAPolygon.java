import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class InsideAPolygon extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Enter five points:");
        Scanner input = new Scanner(System.in);
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();
        for (int i = 0; i < 8; i++) {
            list.add(input.nextDouble());
        }
        double x = input.nextDouble();
        double y = input.nextDouble();

        Pane pane = new Pane();
        pane.getChildren().add(polygon);
        Circle circle = new Circle(x, y, 2);
        pane.getChildren().add(circle);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        // Create a Text
        Text text = new Text("The point is " +
                (polygon.contains(x, y) ? "" : "not ") + "inside the polygon  ");
        borderPane.setBottom(text);
        BorderPane.setAlignment(text, Pos.CENTER);

        Scene scene = new Scene(borderPane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
