import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EyeHandCoordination extends Application {
    private Pane pane = new Pane();
    private Circle circle = new Circle(10);
    private Text text = new Text();
    private long startTime, endTime;
    private int clickCount = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        setRandomProperties();

        circle.setOnMouseClicked(event -> {
            clickCount++;
            System.out.println(clickCount);
            if (clickCount == 1) {
                startTime = System.currentTimeMillis();
            }
            if (clickCount < 4) {
                setRandomProperties();
            } else {
                endTime = System.currentTimeMillis();
                text.setText("The spent is " + (endTime - startTime) + " milliseconds");
                text.setX(20);
                text.setY(20);
                pane.getChildren().add(text);
                pane.getChildren().remove(circle);
            }

        });


        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setRandomProperties() {
        circle.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
        circle.setCenterX(10 + Math.random() * 230);
        circle.setCenterY(10 + Math.random() * 230);
    }
}
