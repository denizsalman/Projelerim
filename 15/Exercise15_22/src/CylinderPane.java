import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class CylinderPane extends Pane {
    private double w = 100;
    private double h = 200;
    private double radiusX;
    private double radiusY;


    public CylinderPane() {
        paintCylinder();
    }

    public void paintCylinder() {
        radiusX = (w - 20) / 2;
        radiusY = radiusX / 2;

        getChildren().clear();

        Ellipse ellipse = new Ellipse(w / 2, radiusY + 10, radiusX, radiusY);
        setPadding(new Insets(0, 10, 40, 0));
        double startX = ellipse.getCenterX() - ellipse.getRadiusX();
        double startY = ellipse.getCenterY();
        double endX = startX;
        double endY =  h * 0.8;
        Line line1 = new Line(startX, startY, endX, endY);
        startX += 2 * ellipse.getRadiusX();
        startY = startY;
        endX = startX;
        endY = endY;
        Line line2 = new Line(startX, startY, endX, endY);
        double arcX = ellipse.getCenterX();
        double arcY = endY;
        Arc arc1 = new Arc(arcX, arcY, radiusX, radiusY, 0, -180);
        arc1.setType(ArcType.OPEN);
        arc1.setFill(Color.WHITE);
        arc1.setStroke(Color.BLACK);
        Arc arc2 = new Arc(arcX, arcY, radiusX, radiusY, 0, 180);
        arc2.setType(ArcType.OPEN);
        arc2.setFill(Color.WHITE);
        arc2.setStroke(Color.BLACK);
        arc2.getStrokeDashArray().addAll(6.0, 21.0);
        getChildren().addAll(ellipse, line1, line2,arc1, arc2);
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
        paintCylinder();
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
        paintCylinder();
    }

    public double getRadiusX() {
        return radiusX;
    }

    public void setRadiusX(double radiusX) {
        this.radiusX = radiusX;
    }

    public double getRadiusY() {
        return radiusY;
    }

    public void setRadiusY(double radiusY) {
        this.radiusY = radiusY;
    }
}
