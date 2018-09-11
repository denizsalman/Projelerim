import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Number> list = new ArrayList<>();
        list.add(12);
        list.add(10.5);
        list.add(15);
        list.add(3);
        shuffle(list);
        while (!list.isEmpty()) {
            System.out.println(list.remove(0));
        }
    }

    private static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }
}
