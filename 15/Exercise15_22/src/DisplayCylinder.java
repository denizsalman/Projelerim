import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayCylinder extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        CylinderPane cylinderPane = new CylinderPane();

        pane.widthProperty().addListener(observable ->
                cylinderPane.setW(pane.getWidth()));

        pane.heightProperty().addListener(observable ->
                cylinderPane.setH(pane.getHeight()));
        pane.getChildren().add(cylinderPane);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
