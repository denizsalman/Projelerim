import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File file = new File("Main.java");
        ArrayList<String> list = new ArrayList<>();
        if (!file.exists())
            throw new FileNotFoundException();

        try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter("output.java");
                )        {

            output.print(input.nextLine());
            while (input.hasNext()) {
                String s1 = input.nextLine();
                if (s1.replaceAll(" ", "").equals("{")) {
                    output.println(s1);
                } else {
                    output.println();
                    output.print(s1);
                }
            }
        }


    }
}