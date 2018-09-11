import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {

    public Main() {
        System.out.println("Main constructor is invoked");
    }

    public static void main(String[] args) {
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        d1.bindBidirectional(d2);
        System.out.println("d1 is " + d1.getValue() +
        "\nd2 is: " + d2.getValue());
        d2.setValue(5);
        System.out.println(d1.getValue());
        d1.setValue(3);
        System.out.println(d2.getValue());
    }
}
