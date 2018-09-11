import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SliderDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text(20, 20, "JavaFX Programing");

        Slider sbHorizontal = new Slider();
        sbHorizontal.setShowTickLabels(true);
        sbHorizontal.setShowTickMarks(true);

        Slider sbVertical = new Slider();
        sbVertical.setOrientation(Orientation.VERTICAL);
        sbVertical.setShowTickLabels(true);
        sbVertical.setShowTickMarks(true);
        sbVertical.setValue(100);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(sbHorizontal);
        pane.setRight(sbVertical);

        sbHorizontal.valueProperty().addListener(observable -> {
            text.setX(sbHorizontal.getValue() * paneForText.getWidth() /
                    sbHorizontal.getMax());
        });

        sbVertical.valueProperty().addListener(observable -> {
            text.setY(sbVertical.getValue() * paneForText.getHeight() /
                    sbVertical.getMax());
        });

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
