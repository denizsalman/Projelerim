import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Hangman extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Polyline polyline = new Polyline(40, 250, 40, 10, 150, 10, 150, 60);

        Arc arc = new Arc(40, 270, 35, 20, 0, 180);
        arc.setType(ArcType.OPEN);

        Circle kafa = new Circle(20);
        kafa.setCenterX(150);
        kafa.setCenterY(80);
        kafa.setFill(null);
        kafa.setStroke(Color.BLACK);
        double kolUzunlugu = 50;
        double startXSolKol = kafa.getCenterX() - kafa.getRadius() * Math.sin(Math.PI / 4);
        double startYSolKol = kafa.getCenterY() + kafa.getRadius() * Math.cos(Math.PI / 4);
        Line solKol = new Line(startXSolKol, startYSolKol, startXSolKol - kolUzunlugu,
                startYSolKol + kolUzunlugu);

        double startXSagKol = kafa.getCenterX() + kafa.getRadius() * Math.sin(Math.PI / 4);
        double startYSagKol = kafa.getCenterY() + kafa.getRadius() * Math.cos(Math.PI / 4);
        Line sagKol = new Line(startXSagKol, startYSagKol, startXSagKol + kolUzunlugu,
                startYSagKol + kolUzunlugu);

        double govdeUzunlugu = 80;
        Line govde = new Line(kafa.getCenterX(), kafa.getCenterY() + kafa.getRadius(),
                kafa.getCenterX(), kafa.getCenterY() + kafa.getRadius() + govdeUzunlugu);

        double bacakUzunluk = 40;
        double bacakStartX = govde.getEndX();
        double bacakStartY = govde.getEndY();

        Line solBacak = new Line(bacakStartX, bacakStartY, bacakStartX - bacakUzunluk,
                bacakStartY + bacakUzunluk);
        Line sagBacak = new Line(bacakStartX, bacakStartY, bacakStartX + bacakUzunluk,
                bacakStartY + bacakUzunluk);
        pane.getChildren().addAll(polyline, arc, kafa, solKol, sagKol, govde, solBacak, sagBacak);
        Scene scene = new Scene(pane, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
