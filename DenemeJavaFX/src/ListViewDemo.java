import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

    private String[] flagTitles = {"Canada", "China", "Denmark",
            "France", "Germany", "India", "Norway", "United Kingdom",
            "United States Of America"};

    private ImageView[] flagImage = {new ImageView("file:image/ca.gif"),
            new ImageView("file:image/china.gif"),
            new ImageView("file:image/denmark.gif"),
            new ImageView("file:image/fr.gif"),
            new ImageView("file:image/germany.gif"),
            new ImageView("file:image/india.gif"),
            new ImageView("file:image/norway.gif"),
            new ImageView("file:image/uk.gif"),
            new ImageView("file:image/us.gif")};

    @Override
    public void start(Stage primaryStage) throws Exception {

        ListView<String> lv = new ListView<>(FXCollections.observableArrayList(flagTitles));
        lv.setPrefSize(400, 400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        FlowPane imagePane = new FlowPane(10, 10);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(lv));
        pane.setCenter(imagePane);

        lv.getSelectionModel().selectedItemProperty().addListener(
                observable -> {
                    imagePane.getChildren().clear();
                    for (Integer i: lv.getSelectionModel().getSelectedIndices())
                        imagePane.getChildren().add(flagImage[i]);
                }
        );

        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
