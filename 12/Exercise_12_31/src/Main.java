import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the gender: ");
        String gender = input.next();
        System.out.print("Enter the name: ");
        String name = input.next();

        ArrayList<String> list = new ArrayList<>();
        try {
            URL url = new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking" + year + ".txt");
            Scanner inputData = new Scanner(url.openStream());
            while (inputData.hasNext()) {
                for (int i = 0; i < 5; i++) {
                    list.add(inputData.next());
                }
                if (list.get(getGender(gender)).equals(name)) {
                    System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
                    System.exit(1);
                }
                list.clear();
            }
            System.out.println("The name ABC is not ranked in year 2010");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getGender(String gender) {
        if (gender.equals("M")) {
            return 1;
        } else
            return 3;
    }
}
