import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvenstmentValueCalculator extends Application {
    TextField tfInvestmentAmount = new TextField();
    TextField tfNumberOfYears = new TextField();
    TextField tfAnnualInterestRate = new TextField();
    TextField tfFutureValue = new TextField();
    Button btCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20));


        tfFutureValue.setEditable(false);

        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(new Label("Investment Amount:"), 0, 0);
        pane.add(tfInvestmentAmount, 1, 0);
        pane.add(new Label("Number of Years:"), 0, 1);
        pane.add(tfNumberOfYears, 1, 1);
        pane.add(new Label("Annual Interest Rate:"), 0, 2);
        pane.add(tfAnnualInterestRate, 1, 2);
        pane.add(new Label("Future Value"), 0, 3);
        pane.add(tfFutureValue, 1, 3);
        pane.add(btCalculate, 1, 4);

        pane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        btCalculate.setOnAction(event -> calculate());

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void calculate() {
        double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
        double numberOfYears = Double.parseDouble(tfNumberOfYears.getText());
        double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());
        double mothlyInterestRate = annualInterestRate / 1200;
        double futureValue = investmentAmount * Math.pow(1 + mothlyInterestRate, numberOfYears * 12);

        tfFutureValue.setText(String.format("%.2f", futureValue));
    }
}
