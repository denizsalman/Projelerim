import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class DisplayPieChart extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Arc arc1 = new Arc(110, 110, 100,
                100, 0, 360 * 0.2);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);
        Arc arc2 = new Arc(110, 110, 100,
                100, arc1.getLength(), 360 * 0.1);
        arc2.setFill(Color.BLUE);
        arc2.setType(ArcType.ROUND);
        Arc arc3 = new Arc(110, 110, 100,
                100, arc2.getLength() + arc2.getStartAngle(), 360 * 0.3);
        arc3.setFill(Color.GREEN);
        arc3.setType(ArcType.ROUND);
        Arc arc4 = new Arc(110, 110, 100,
                100, arc3.getLength() + arc3.getStartAngle(), 360 * 0.4);
        arc4.setFill(Color.ORANGE);
        arc4.setType(ArcType.ROUND);

        Pane pane = new Pane();
        pane.getChildren().addAll(arc1, arc2, arc3, arc4);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
