import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file of scores: ");
        String fileName = input.next();
        File file = new File(fileName);
        int numberOfScores = 0;
        double totalScores = 0;
        double avarege = 0;
        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        try (
                Scanner inputFile = new Scanner(file);
                ) {
            while (inputFile.hasNext()) {
                totalScores += Double.parseDouble(inputFile.next());
                numberOfScores++;
            }

        }
        avarege = totalScores / numberOfScores;
        System.out.println("Total Score: " + totalScores +
        "\nAvarage: " + avarege);
    }
}
