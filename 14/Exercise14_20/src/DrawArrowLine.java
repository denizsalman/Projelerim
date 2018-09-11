import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawArrowLine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        drawArrowLine(50, 10, 100, 100, pane);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        System.out.println();
    }

    public static void drawArrowLine(double startX, double startY,
                                     double endX, double endY, Pane pane) {
        Line line = new Line(startX, startY, endX, endY);
        double ex = endX;
        double ey = endY;
        double sx = startX;
        double sy = startY;
        double arrowLength = 20;
        double arrowWidth = 7;
        Line arrow1 = new Line();
        Line arrow2 = new Line();
        arrow1.setEndX(ex);
        arrow1.setEndY(ey);
        arrow2.setEndX(ex);
        arrow2.setEndY(ey);
        if (ex == sx && ey == sy) {
            // arrow parts of length 0
            arrow1.setStartX(ex);
            arrow1.setStartY(ey);
            arrow2.setStartX(ex);
            arrow2.setStartY(ey);
        } else {
            double factor = arrowLength / Math.hypot(sx-ex, sy-ey);
            double factorO = arrowWidth / Math.hypot(sx-ex, sy-ey);

            // part in direction of main line
            double dx = (sx - ex) * factor;
            double dy = (sy - ey) * factor;

            // part ortogonal to main line
            double ox = (sx - ex) * factorO;
            double oy = (sy - ey) * factorO;

            arrow1.setStartX(ex + dx - oy);
            arrow1.setStartY(ey + dy + ox);
            arrow2.setStartX(ex + dx + oy);
            arrow2.setStartY(ey + dy - ox);
        }

        pane.getChildren().addAll(line, arrow1, arrow2);


    }
}
