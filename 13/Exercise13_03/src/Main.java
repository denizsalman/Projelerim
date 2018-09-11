import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Number> list = new ArrayList<>();
        list.add(3);
        list.add(5.4);
        list.add(5.1);
        list.add(1);
        sort(list);
        while (!list.isEmpty()) {
            System.out.println(list.remove(0));
        }
    }

    private static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            double min = list.get(i).doubleValue();
            for (int j = i; j < list.size(); j++) {
                if (min > list.get(j).doubleValue()) {
                    min = list.get(j).doubleValue();
                    list.set(j, list.get(i));
                    list.set(i, min);
                }
            }
        }
    }
}
