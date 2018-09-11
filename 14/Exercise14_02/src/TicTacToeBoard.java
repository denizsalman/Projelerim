import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int rnd = (int) (Math.random() * 3);
                if (rnd == 0) {
                    continue;
                } else if (rnd == 1) {
                    pane.add(new ImageView("file:image/x.gif"), j, i);
                } else {
                    pane.add(new ImageView("file:image/o.gif"), j, i);
                }
            }
        }

        pane.setPadding(new Insets(5, 30, 5, 30));
        Scene scene = new Scene(pane);
        primaryStage.setTitle("TicTacToeBoard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
