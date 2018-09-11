import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class DisplayThreeCards extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox(5);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            String s = "file:card/" + i + ".png";
            list.add(s);
        }
        Collections.shuffle(list);
        for (int i = 0; i < 3; i++) {
            hBox.getChildren().add(new ImageView(list.get(i)));
        }

        Scene scene = new Scene(hBox);
        primaryStage.setTitle("DisplayThreeCards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
