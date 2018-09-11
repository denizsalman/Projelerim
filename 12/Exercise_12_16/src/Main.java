import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 file oldString newString");
            System.exit(1);
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter("output.txt");
                )
        {
            while (input.hasNext()) {
                String s = input.nextLine();
                s = s.replaceAll(args[1], args[2]);
                output.println(s);
            }
        }

    }
}
