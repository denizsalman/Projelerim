import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class PickFourCards extends Application {
    HBox hBox = new HBox(10);
    ArrayList<String> list = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        hBox.setPadding(new Insets(20));

        for (int i = 1; i <= 52; i++) {
            String s = "file:card/" + i + ".png";
            list.add(s);
        }
        refresh();

        Button btRefresh = new Button("Refresh");
        btRefresh.setOnAction(event -> {
            refresh();
        });


        borderPane.setBottom(btRefresh);
        borderPane.setCenter(hBox);
        BorderPane.setAlignment(btRefresh, Pos.CENTER);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void refresh() {
        Collections.shuffle(list);
        hBox.getChildren().clear();
        for (int i = 0; i < 4; i++) {
            hBox.getChildren().add(new ImageView(list.get(i)));
        }
    }
}
