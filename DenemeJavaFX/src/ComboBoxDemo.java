import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {

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

    private String[] flagDescription = new String[9];

    private DescriptionPane descriptionPane = new DescriptionPane();

    private ComboBox<String> cbo = new ComboBox<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        flagDescription[0] = "The Canadian national flag ...";
        flagDescription[1] = "Description for China ... ";
        flagDescription[2] = "Description for Denmark ... ";
        flagDescription[3] = "Description for France ... ";
        flagDescription[4] = "Description for Germany ... ";
        flagDescription[5] = "Description for India ... ";
        flagDescription[6] = "Description for Norway ... ";
        flagDescription[7] = "Description for UK ... ";
        flagDescription[8] = "Description for US ... ";

        setDisplay(0);

        BorderPane pane = new BorderPane();

        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select a Country: "));
        paneForComboBox.setCenter(cbo);

        ObservableList<String> items =
                FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);
        cbo.setPrefWidth(400);
        cbo.setValue("Canada");

        cbo.setOnAction(event -> {
            setDisplay(items.indexOf(cbo.getValue()));
            System.out.println(items.indexOf(cbo.getValue()));
        });

        descriptionPane.setTop(paneForComboBox);

        Scene scene = new Scene(descriptionPane);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public void setDisplay(int index) {
        descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }
}
