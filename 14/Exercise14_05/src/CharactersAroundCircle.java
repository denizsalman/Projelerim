import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CharactersAroundCircle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        String s = "WELCOME TO JAVA";
        Circle circle = new Circle(50);
        circle.setCenterX(90);
        circle.setCenterY(90);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);
        for (int i = 0; i < s.length(); i++) {
            Text text = new Text(s.charAt(i) + "");
            double textX = circle.getCenterX() + Math.sin(2 * Math.PI / s.length() * i) * circle.getRadius();
            double textY = circle.getCenterY() - Math.cos(2 * Math.PI / s.length() * i) * circle.getRadius();
            System.out.println(textX);
            System.out.println(textY);
            System.out.println();
            text.setX(textX);
            text.setY(textY);
            text.setRotate(360 / s.length() * i);
            pane.getChildren().add(text);
        }

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
