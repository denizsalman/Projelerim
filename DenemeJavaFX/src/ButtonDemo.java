import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ButtonDemo extends Application {
    protected Text text = new Text(50, 50, "JavaFX Programming");

    protected BorderPane getPane() {
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("Left", new ImageView("file:image/left.gif"));
        Button btRight = new Button("Right", new ImageView("file:image/right.gif"));

        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");
        paneForButtons.getChildren().addAll(btLeft, btRight);

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForTexts = new Pane();
        paneForTexts.getChildren().addAll(text);

        pane.setCenter(paneForTexts);

        btLeft.setOnAction(event -> text.setX(text.getX() - 10));
        btRight.setOnAction(event -> text.setX(text.getX() + 10));

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(getPane(), 450, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
