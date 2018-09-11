import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        if (args.length != 3) {
            System.out.println("Usage: java Main dir oldString newString");
        }
        ArrayList<String> list = new ArrayList<>();
        File dir = new File(args[0]);
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            try (
                    Scanner input = new Scanner(files[i]);
                    )
            {
                while (input.hasNext()) {
                    list.add(input.nextLine().replaceAll(args[1], args[2]));
                }
            }

            try (
                    PrintWriter printWriter = new PrintWriter(files[i]);
            )
            {
                while (!list.isEmpty()) {
                    printWriter.println(list.remove(0));
                }
            }
        }
    }
}
