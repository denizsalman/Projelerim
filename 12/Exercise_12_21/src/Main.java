import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File file = new File("SortedStrings.txt");
        ArrayList<String> list = new ArrayList<>();
        String s1 = "", s2;
        try (
                Scanner input = new Scanner(file);
                )
        {
            if (input.hasNext()) {
                s1 = input.next();
            }
            while (input.hasNext()) {
                s2 = input.next();
                if (s1.compareTo(s2) > 0) {
                    System.out.println(s1 + " " + s2);
                    break;
                }
                s1 = s2;
            }
        }

    }

}
