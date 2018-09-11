import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        String targetString = args[0];
        String fileName = args[1];

        File targetFile = new File(fileName);
        if (!targetFile.exists())
            throw new FileNotFoundException();

       try (
               Scanner input = new Scanner(targetFile);
               PrintWriter newFile = new PrintWriter("modifiedFile.txt");
        ) {
           while (input.hasNext()) {
               String s = input.nextLine();

               s = s.replaceAll(targetString, "");
               newFile.println(s);
           }

        }


    }
}
