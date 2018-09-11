import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter a URL: ");
        String urlString = new Scanner(System.in).next();
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();
        listOfPendingURLs.add(urlString);
        while (!listOfPendingURLs.isEmpty()) {
            urlString = listOfPendingURLs.remove(0);
            listOfTraversedURLs.add(urlString);
            try {
                 for (String s: getSubURLs(urlString)) {
                     System.out.println(s);
                     if (!listOfTraversedURLs.contains(s)) {
                         listOfPendingURLs.add(s);
                     }
                 }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static ArrayList<String> getSubURLs(String urlString) throws IOException {
        ArrayList<String> urlsList = new ArrayList<>();
        try (
                Scanner input = new Scanner(new URL(urlString).openStream())
                )
        {
            while (input.hasNext()) {
                String word = input.nextLine();
                if (word.contains("Computer Programming")) {
                    System.out.println(urlString);
                    System.exit(0);
                }
                int current = word.indexOf("http://www");
                while (current > 0) {
                    int endIndex = word.indexOf("\"", current);
                    if (endIndex > 0) {
                        urlsList.add(word.substring(current, endIndex));
                        current = word.indexOf("http://www", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        }
        return urlsList;
    }
}
