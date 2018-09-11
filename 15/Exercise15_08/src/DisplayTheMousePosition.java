import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayTheMousePosition extends Application {
    Text text = new Text();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setOnMouseClicked(new moueseEventHandler());
        pane.setOnMousePressed(new moueseEventHandler());

        pane.setOnMouseReleased(event -> {
            text.setVisible(false);
        });
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class moueseEventHandler implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent event) {
            text.setText("(" + event.getX() +
                    ", " + event.getY() + ")");
            text.setX(event.getX());
            text.setY(event.getY());
            text.setVisible(true);
        }
    }
}
