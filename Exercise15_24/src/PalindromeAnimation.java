import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PalindromeAnimation extends Application {
    private Arc arc = new Arc();
    private Circle circle = new Circle(10);
    private double x;
    private double y;
    private double w = 200;
    private double h = 200;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setPadding(new Insets(40));
        x = w / 2;
        y = h / 2;
        arc.setCenterX(x);
        arc.setCenterY(y);
        arc.setRadiusX(w * 0.4);
        arc.setRadiusY(h * 0.3);
        arc.setStartAngle(-30);
        arc.setLength(-120);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(1000));
        pt.setPath(arc);
        pt.setNode(circle);
        pt.setAutoReverse(true);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.play();

        FadeTransition ft = new FadeTransition();
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setDuration(Duration.millis(1000));
        ft.setAutoReverse(true);
        ft.setNode(circle);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.play();

        pane.getChildren().addAll(arc, circle);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
