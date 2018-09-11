import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class DescriptionPane extends BorderPane {
    private Label lblImageTitle = new Label();

    private TextArea taDescription = new TextArea();

    public DescriptionPane() {
        lblImageTitle.setContentDisplay(ContentDisplay.TOP);
        lblImageTitle.setFont(new Font("SansSerif", 16));
        lblImageTitle.setPrefSize(200, 100);



        taDescription.setWrapText(true);
        taDescription.setFont(new Font("Serif", 14));
        taDescription.setEditable(false);

        ScrollPane scrollPane = new ScrollPane(taDescription);


        setLeft(lblImageTitle);
        setCenter(scrollPane);
        setPadding(new Insets(5, 5, 5, 5));

    }

    public void setTitle(String title) {
        lblImageTitle.setText(title);
    }

    public void setImageView(ImageView icon) {
        lblImageTitle.setGraphic(icon);
    }

    public void setDescription(String text) {
        taDescription.setText(text);
    }
}
