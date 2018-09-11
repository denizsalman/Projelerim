import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class FanPane extends Pane {
    public FanPane() {
        Circle circle = new Circle(90);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        getChildren().add(circle);
        Arc[] arcs = new Arc[4];
        for (int i = 0; i < 4; i++) {
            arcs[i] = new Arc(circle.getCenterX(), circle.getCenterY(),
                    circle.getRadius() - 10,circle.getRadius() - 10 ,360 / 4 * i, -35);
            arcs[i].setType(ArcType.ROUND);
            getChildren().add(arcs[i]);
        }
    }


}
