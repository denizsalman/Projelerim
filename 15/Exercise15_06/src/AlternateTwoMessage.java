import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlternateTwoMessage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        Text text = new Text("Java is fun");

        text.setOnMouseClicked(event -> {
            if (event.getClickCount() % 2 == 0) {
                text.setText("Java is Fun");
            } else {
                text.setText("Java is Powerful");
            }
        });

        pane.getChildren().add(text);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
