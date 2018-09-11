import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlotTheSinAndCos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(50));
        Line lineX = new Line(-30, 0, 350, 0);
        Line lineY = new Line(0, 0, 0, 150);
        Pane pane = new Pane();

        for (int i = -2; i <= 2; i++) {
            String s;
            if (i != 0)
                s = i + "n";
            else
                s = i + "";
            Text text = new Text(s);

        }
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            list.add(x + 200.0);
            list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
        }
        Polyline polylineCos = new Polyline();
        ObservableList<Double> listCos = polylineCos.getPoints();
        scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            listCos.add(x + 200.0);
            listCos.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
        }
        stackPane.getChildren().addAll(polyline, polylineCos, lineX, lineY, pane);
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
