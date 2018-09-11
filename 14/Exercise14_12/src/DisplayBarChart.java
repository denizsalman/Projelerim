import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DisplayBarChart extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new StackPane();
        pane.setPadding(new Insets(20));
        BarChartPane barChartPane = new BarChartPane(20, 10, 30, 40);
        pane.getChildren().add(barChartPane);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
