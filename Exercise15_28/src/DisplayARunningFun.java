import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DisplayARunningFun extends Application {
    private FanPane fanPane = new FanPane();
    private Button btPause = new Button("Pause");
    private Button btResume = new Button("Resume");
    private Button btReverse = new Button("Reverse");
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(fanPane);
        BorderPane.setAlignment(fanPane, Pos.CENTER);

        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(btPause, btResume, btReverse);

        btPause.setOnAction(event -> fanPane.pause());
        btResume.setOnAction(event -> fanPane.play());
        btReverse.setOnAction(event -> fanPane.reverse());

        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
