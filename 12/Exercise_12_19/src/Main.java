import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
	// write your code here

        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                input.next();
                count++;
            }
            System.out.println("The file has " + count + " words.");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
