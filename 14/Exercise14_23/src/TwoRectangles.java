import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoRectangles extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle r1 = new Rectangle(80, 19, 30, 20);
        r1.setFill(null);
        Text t1 = new Text("r1");
        t1.setX(r1.getX() + 5);
        t1.setY(r1.getY() + 10);
        r1.setStroke(Color.BLACK);
        Rectangle r2 = new Rectangle(100, 45, 40,30 );
        Text t2 = new Text("r2");
        t2.setX(r2.getX() + 5);
        t2.setY(r2.getY() + 10);
        r2.setFill(null);
        r2.setStroke(Color.BLACK);
        Text text = new Text();
        if (contains(r1, r2)) {
            text.setText("One rectangle is contained in another");
        } else if (isOverlap(r1, r2) || isOverlap(r2, r1)) {
            text.setText("The rectangles overlap");
        } else {
            text.setText("The rectangles do not overlap");
        }
        Pane pane = new Pane();
        BorderPane borderPane = new BorderPane();
        pane.getChildren().addAll(r1, t1, r2, t2);
        borderPane.setCenter(pane);
        borderPane.setBottom(text);
        BorderPane.setAlignment(text, Pos.CENTER);
        Scene scene = new Scene(borderPane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static boolean contains(Rectangle r1, Rectangle r2) {
        return r2.getX() >= r1.getX() && r2.getY() >= r1.getY()
                && r1.getX() + r1.getWidth() >= r2.getX() + r2.getWidth()
                && r1.getY() + r1.getHeight() >= r2.getY() + r2.getHeight();
    }

    public static boolean isOverlap(Rectangle r1, Rectangle r2) {
        if (r1.getX() <= r2.getX() && r1.getX() + r1.getWidth() >= r2.getX()) {
            return r1.getY() + r1.getHeight() >= r2.getY() &&
                    (r1.getY() <= r2.getY() + r2.getHeight());
        }
        return false;
    }


}
