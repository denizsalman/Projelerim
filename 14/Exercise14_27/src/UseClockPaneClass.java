import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UseClockPaneClass extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClockPane clockPane = new ClockPane();
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(clockPane);
        Text text = new Text(clockPane.getHour() + " : " + clockPane.getMinute()
                + " : " + clockPane.getSecond());
        borderPane.setBottom(text);
        BorderPane.setAlignment(text, Pos.CENTER);

        Scene scene = new Scene(borderPane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
