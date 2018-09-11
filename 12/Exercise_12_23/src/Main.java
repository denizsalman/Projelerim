import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            double total = 0;
            int count = 0;
            while (input.hasNext()) {
                    total += Double.parseDouble(input.next());
                    count++;
            }
            System.out.println("Total: "+total+
            "\nAverage: " + total / count);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
