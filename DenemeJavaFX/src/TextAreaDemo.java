import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        DescriptionPane descriptionPane = new DescriptionPane();

        descriptionPane.setTitle("Canada");
        String description = "The Canadian national flag ...";
        descriptionPane.setImageView(new ImageView("file:image/ca.gif"));
        descriptionPane.setDescription(description);

        Scene scene = new Scene(descriptionPane, 450, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
