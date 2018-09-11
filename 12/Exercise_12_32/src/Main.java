import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] table = new String[10][10];
        for (int i = 0; i < 10; i++) {
            try {
                URL url = new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking" + (2010 - i) + ".txt");
                Scanner input = new Scanner(url.openStream());
                for (int k = 0; k < 5; k++){
                    ArrayList<String> list = new ArrayList<>();
                    for (int j = 0; j < 5; j++) {
                        list.add(input.next());
                    }
                    table[i][k + 5] = list.get(1);
                    table[i][k] = list.get(3);
                    list.clear();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        printTable(table);

    }

    private static void printTable(String[][] table) {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Year Rank 1    Rank 2    Rank 3    Rank 4    Rank 5    Rank 1    Rank 2    Rank 3    Rank 4    Rank 5");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%-5d", 2010 - i);
            for (int j = 0; j < table[0].length; j++) {
                System.out.printf("%-10s", table[i][j]);
            }
            System.out.println();
        }
    }
}
