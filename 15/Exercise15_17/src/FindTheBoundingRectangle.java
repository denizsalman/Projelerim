import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class FindTheBoundingRectangle extends Application {
    Pane pane = new Pane();
    double circleRadius = 10;
    ArrayList<Circle> list = new ArrayList<>();
    Rectangle rectangle = new Rectangle();
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane infoPane = new StackPane();

        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        Label label = new Label("INSTRUCTION\n" +
                "Add: Left Click\n" +
                "Remove Left Click");

        infoPane.getChildren().add(label);
        infoPane.setStyle("-fx-border-color: black");
        infoPane.setPadding(new Insets(10, 10,10,10));
        infoPane.setLayoutX(10);
        infoPane.setLayoutY(10);

        pane.getChildren().add(rectangle);
        pane.getChildren().add(infoPane);

        pane.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                Circle circle = new Circle(event.getX(), event.getY(), circleRadius);
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);
                list.add(circle);
                rectangle.setX(getLeftX());
                rectangle.setY(getTopY());
                rectangle.setWidth(getRightX() - getLeftX());
                rectangle.setHeight(getBottomY() - getTopY());
                pane.getChildren().add(circle);
            } else if (event.getButton().equals(MouseButton.SECONDARY)) {
                for (Circle circle :list) {
                    if (circle.contains(event.getX(), event.getY())) {
                        pane.getChildren().remove(circle);
                        list.remove(circle);
                        break;
                    }
                }
                rectangle.setX(getLeftX());
                rectangle.setY(getTopY());
                rectangle.setWidth(getRightX() - getLeftX());
                rectangle.setHeight(getBottomY() - getTopY());
            }
        });



        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public double getTopY() {
        double topY = list.get(0).getCenterY();
        for (int i = 0; i < list.size(); i++) {
            if (topY > list.get(i).getCenterY()) {
                topY = list.get(i).getCenterY();
            }
        }
        return topY - circleRadius;
    }

    public double getBottomY() {
        double bottomY = list.get(0).getCenterY();
        for (int i = 0; i < list.size(); i++) {
            if (bottomY < list.get(i).getCenterY()) {
                bottomY = list.get(i).getCenterY();
            }
        }
        return bottomY + circleRadius;
    }

    public double getLeftX() {
        double leftX = list.get(0).getCenterX();
        for (int i = 0; i < list.size(); i++) {
            if (leftX > list.get(i).getCenterX()) {
                leftX = list.get(i).getCenterX();
            }
        }
        return leftX - circleRadius;
    }

    public double getRightX() {
        double rightX = list.get(0).getCenterX();
        for (int i = 0; i < list.size(); i++) {
            if (rightX < list.get(i).getCenterX()) {
                rightX = list.get(i).getCenterX();
            }
        }
        return rightX + circleRadius;
    }
}
