import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.add(new ImageView("file:image/flag3.gif"), 0, 0);
        pane.add(new ImageView("file:image/flag4.gif"), 1, 0);
        pane.add(new ImageView("file:image/flag5.gif"), 0, 1);
        pane.add(new ImageView("file:image/flag6.gif"), 1, 1);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
