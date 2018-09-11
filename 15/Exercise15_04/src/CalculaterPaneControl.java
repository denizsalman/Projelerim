import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculaterPaneControl extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        CalculatorPane calculatorPane = new CalculatorPane();
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(calculatorPane);

        Button btAdd = new Button("Add");
        btAdd.setOnAction(event -> calculatorPane.add());
        Button btSubtract = new Button("Subtract");
        btSubtract.setOnAction(event -> calculatorPane.subtract());
        Button btMultiply = new Button("Multiply");
        btMultiply.setOnAction(event -> calculatorPane.multiply());
        Button btDivide = new Button("Divide");
        btDivide.setOnAction(event -> calculatorPane.divide());
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
        hBox.setAlignment(Pos.CENTER);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);
        BorderPane.setAlignment(calculatorPane, Pos.CENTER);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
