import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MyJavaFX extends Application {
    public MyJavaFX() {
        System.out.println("MyJavaFx called");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        ClockPane pane = new ClockPane();
        borderPane.setCenter(pane);
        Label label = new Label(pane.getHour() + ":" + pane.getMinute() +
                ":" + pane.getSecond());
        borderPane.setBottom(label);
        BorderPane.setAlignment(label, Pos.CENTER);
        BorderPane.setAlignment(pane, Pos.CENTER);
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
