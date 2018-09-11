import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorAndFont extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(30, 0, 30, 0));
        Text[] texts = new Text[5];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = new Text("Java");
            texts[i].setFont(Font.font("Times Roman", FontWeight.BOLD,
                    FontPosture.ITALIC, 22));
            texts[i].setFill(new Color(Math.random(), Math.random(),
                    Math.random(), Math.random()));
            texts[i].setRotate(90);
            hBox.getChildren().add(texts[i]);
        }
        Scene scene = new Scene(hBox);
        primaryStage.setTitle("ColorAndFont");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
