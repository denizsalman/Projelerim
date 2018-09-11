import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class CalculatorPane extends HBox {
    Label lbNumber1 = new Label("Number 1:");
    TextField tfNumber1 = new TextField();
    Label lbNumber2 = new Label("Number 2:");
    TextField tfNumber2 = new TextField();
    Label lbResult = new Label("Result:");
    TextField tfResult = new TextField();

    public CalculatorPane() {
        tfNumber1.setPrefColumnCount(2);
        setSpacing(10);
        tfNumber2.setPrefColumnCount(2);
        tfResult.setPrefColumnCount(2);
        tfResult.setEditable(false);
        getChildren().addAll(lbNumber1, tfNumber1, lbNumber2, tfNumber2,
                lbResult, tfResult);
        setAlignment(Pos.CENTER);
        setPadding(new Insets(0, 0, 20,0));

    }

    public void add() {
        tfResult.setText(Double.parseDouble(tfNumber1.getText()) + Double.parseDouble(tfNumber2.getText()) + "");
    }

    public void subtract() {
        tfResult.setText(Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText()) + "");
    }

    public void multiply() {
        tfResult.setText(Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText()) + "");
    }

    public void divide() {
        tfResult.setText(Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText()) + "");
    }
}
