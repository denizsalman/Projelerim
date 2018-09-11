import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EnterAndDisplayAString extends Application {
    Text text = new Text();
    String s = "";
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();


        pane.setOnKeyPressed(event -> {

            if (Character.isLetterOrDigit((event.getText() + " ").charAt(0))) {
                s = s + event.getText();
                System.out.println(event.getText());
            } else if (event.getCode() == KeyCode.ENTER) {
                text.setText(s);
                text.setX(125);
                text.setY(125);
            }
        });
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }
}
