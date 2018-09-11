import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlotTheSquareFunction extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Line lineY = new Line(200, 30, 200, 250);
        Polyline lineYPolyline = new Polyline(195, 40, 200, 30, 205, 40);
        Text textY = new Text("y");
        textY.setX(210);
        textY.setY(40);
        Line lineX = new Line(30, 125 + 60, 350, 125 + 60);
        Polyline lineXPolyline = new Polyline(340, 125 + 60 - 5, 350, 125 + 60,
                340, 125 + 60 + 5);
        Text textX = new Text(340, 125 + 60 - 10, "x");
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(125 + 60 - scaleFactor * x * x);
            System.out.println(scaleFactor * x * x);
        }

        pane.getChildren().addAll(polyline, lineX, lineXPolyline, lineY, lineYPolyline, textY, textX);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
