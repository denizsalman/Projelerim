import javax.xml.stream.events.Characters;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter a filename: ");
        File file = new File(new Scanner(System.in).next());

        try {
            occurrences(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void occurrences(File file) throws FileNotFoundException {
        try (
                Scanner input = new Scanner(file);
                )
        {
            int[] count = new int['z' - 'a'];
            while (input.hasNext()) {
                String s = input.nextLine().toUpperCase(Locale.ENGLISH);
                countLetter(s, count);
            }
            for (int i = 0; i < count.length; i++) {
                System.out.println("Number of " + (char)('A' + i) + "'s: " + count[i]);
            }
        }
    }

    private static void countLetter(String s, int[] count) {
        for (int i = 0; i < s.length(); i++) { ;
            if (Character.isLetter(s.charAt(i))) {
                count[s.charAt(i) - 'A']++;
            }
        }
    }
}
