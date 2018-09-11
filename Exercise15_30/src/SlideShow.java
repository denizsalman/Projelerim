import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SlideShow extends Application {
    private Timeline animation;
    private Pane pane = new StackPane();
    private int currentImageValue = 1;
    private ImageView imageView = new ImageView();

    @Override
    public void start(Stage primaryStage) throws Exception {

        pane.getChildren().add(imageView);


        animation = new Timeline(
                new KeyFrame(Duration.millis(500), event -> slide())
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void slide() {
        if (currentImageValue > 54)
            currentImageValue = 1;
        imageView.setImage(new Image("file:card/" + currentImageValue + ".png"));
        currentImageValue++;
    }
}
