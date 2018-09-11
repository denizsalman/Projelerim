import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DisplayRectanguloid extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Rectangle r1 = new Rectangle();
        r1.widthProperty().bind(pane.widthProperty().divide(2));
        r1.heightProperty().bind(pane.heightProperty().divide(2));
        r1.xProperty().bind(pane.widthProperty().divide(4));
        r1.yProperty().bind(pane.widthProperty().divide(4));
        r1.setFill(null);
        r1.setStroke(Color.BLACK);

        Rectangle r2 = new Rectangle();
        r2.widthProperty().bind(pane.widthProperty().divide(2));
        r2.heightProperty().bind(pane.heightProperty().divide(2));
        r2.xProperty().bind(pane.widthProperty().divide(3));
        r2.yProperty().bind(pane.widthProperty().divide(3));
        r2.setFill(null);
        r2.setStroke(Color.BLACK);

        Line l1 = new Line();
        l1.startXProperty().bind(r1.xProperty());
        l1.startYProperty().bind(r1.yProperty());
        l1.endXProperty().bind(r2.xProperty());
        l1.endYProperty().bind(r2.yProperty());

        Line l2 = new Line();
        l2.startXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        l2.startYProperty().bind(r1.yProperty());
        l2.endXProperty().bind(r2.xProperty().add(r2.widthProperty()));
        l2.endYProperty().bind(r2.yProperty());

        Line  l3 = new Line();
        l3.startXProperty().bind(r1.xProperty());
        l3.startYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        l3.endXProperty().bind(r2.xProperty());
        l3.endYProperty().bind(r2.yProperty().add(r2.heightProperty()));

        Line l4 = new Line();
        l4.startXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        l4.startYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        l4.endXProperty().bind(r2.xProperty().add(r2.widthProperty()));
        l4.endYProperty().bind(r2.yProperty().add(r2.heightProperty()));

        pane.getChildren().addAll(r1, r2, l1, l2, l3, l4);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
