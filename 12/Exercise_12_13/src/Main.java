import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File file = new File(args[0]);
        int numberOfLines = 0;
        int numberOfCharacters = 0;
        int numberOfWords = 0;
        try (
                Scanner input = new Scanner(file);
                ) {
            while (input.hasNext()) {
                input.next();
                numberOfWords++;
            }
        }

        try (
                Scanner input = new Scanner(file);
        ) {

            while (input.hasNext()) {
                numberOfCharacters += input.nextLine().length();
                numberOfLines++;
            }

        }

        System.out.println("File " + file.getName() + " has" +
                "\n" + numberOfCharacters + " characters" +
                "\n" + numberOfWords + " words" +
                "\n" + numberOfLines + " lines");
    }
}
