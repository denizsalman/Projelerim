import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class CylinderPane extends Pane {
    Ellipse ellipse = new Ellipse(70, 70, 60, 30);

    public CylinderPane() {
        setPadding(new Insets(0, 10, 40, 0));
        double startX = ellipse.getCenterX() - ellipse.getRadiusX();
        double startY = ellipse.getCenterY();
        double endX = startX;
        double endY = startY + 150;
        Line line1 = new Line(startX, startY, endX, endY);
        startX += 2 * ellipse.getRadiusX();
        startY = startY;
        endX = startX;
        endY = endY;
        Line line2 = new Line(startX, startY, endX, endY);
        double arcX = ellipse.getCenterX();
        double arcY = endY;
        Arc arc1 = new Arc(arcX, arcY, 60, 30, 0, -180);
        arc1.setType(ArcType.OPEN);
        arc1.setFill(Color.WHITE);
        arc1.setStroke(Color.BLACK);
        Arc arc2 = new Arc(arcX, arcY, 60, 30, 0, 180);
        arc2.setType(ArcType.OPEN);
        arc2.setFill(Color.WHITE);
        arc2.setStroke(Color.BLACK);
        arc2.getStrokeDashArray().addAll(6.0, 21.0);
        getChildren().addAll(ellipse, line1, line2,arc1, arc2);
    }

}
