import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class RandomTime extends Application {
    static int a = 3;
    int b = 3;
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClockPane clockPane = new ClockPane();
        clockPane.setSecondHandVisible(true);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(clockPane);
        clockPane.widthProperty().addListener(ov -> {
            clockPane.setW(borderPane.getWidth());
        });

        clockPane.heightProperty().addListener(ov -> {
            clockPane.setH(borderPane.getHeight());
        });
//        borderPane.widthProperty().addListener(observable -> {
//            clockPane.setW(borderPane.getWidth());
//        });
//        borderPane.heightProperty().addListener(observable -> {
//            clockPane.setH(borderPane.getHeight());
//        });
        Scene scene = new Scene(borderPane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static  void  d(){

    }

    public void  h(){

    }
}
