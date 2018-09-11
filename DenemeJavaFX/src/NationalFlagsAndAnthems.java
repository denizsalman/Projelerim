import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class NationalFlagsAndAnthems extends Application {
    private String[] flagNames = {"Denmark", "Germany", "China",
    "India", "Norway", "United Kingdom", "Unites States"};
    private ImageView imageView = new ImageView("file:image/flag0.gif");
    private static final String MEDIA_URI =
            "file:/home/deniz/IdeaProjects/IntroducitonToJava/DenemeJavaFX/audio/anthem";
    private MediaPlayer[] mediaPlayer = new MediaPlayer[7];
    private int currentIndex = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        for (int i = 0; i < mediaPlayer.length; i++) {
            mediaPlayer[i] = new MediaPlayer(new Media(MEDIA_URI + i + ".mp3"));
        }


        ComboBox<String> cbFlags = new ComboBox<>(
                FXCollections.observableArrayList(flagNames));
        cbFlags.setValue("Denmark");

        cbFlags.setOnAction(event -> {
            int index = cbFlags.getItems().indexOf(cbFlags.getValue());
            setDisplay(index);
        });

        HBox hBox = new HBox(10);
        Button btPlay = new Button(">");

        btPlay.setOnAction(event -> {
            if (btPlay.getText() == ">") {
                mediaPlayer[currentIndex].play();
                btPlay.setText("||");
            } else {
                mediaPlayer[currentIndex].pause();
                btPlay.setText(">");
            }
        });
        hBox.getChildren().addAll(btPlay, new Label("Select a nation: "), cbFlags);
        hBox.setAlignment(Pos.CENTER);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(imageView);
        borderPane.setBottom(hBox);
       // BorderPane.setAlignment(hBox, Pos.CENTER);


        Scene scene = new Scene(borderPane, 350, 270);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setDisplay(int index) {
        imageView.setImage(new Image(("file:image/flag" + index + ".gif")));
        mediaPlayer[currentIndex].stop();
        mediaPlayer[index].play();
        currentIndex = index;
    }
}
