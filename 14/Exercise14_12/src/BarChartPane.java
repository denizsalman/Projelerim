import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class BarChartPane extends HBox {

    public BarChartPane(double... grades) {
        super(10);
        setHeight(400);
        setAlignment(Pos.BOTTOM_CENTER);
        setStyle("-fx-background-color: lightgreen");
        for (int i = 0; i < grades.length; i++) {
            Rectangle rectangle = new Rectangle();
            rectangle.setHeight(grades[i] * getHeight() / 100);
            rectangle.setWidth(50);
            Text text = new Text(grades[i] + "");
            VBox vBox = new VBox(10);
            vBox.setAlignment(Pos.BOTTOM_CENTER);
            vBox.getChildren().addAll(text, rectangle);
            getChildren().add(vBox);
        }

    }
}
