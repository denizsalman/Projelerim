import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> fileInputList = new ArrayList<>();
        findDirectorys(list);
        for (int i = 0; i < 7; i++) {
            File file = new File(list.get(i));
            try (
                    Scanner input = new Scanner(file);
                    )
            {
                input.nextLine();
                while (input.hasNext()) {
                    fileInputList.add(input.nextLine());
                }
            }

            try (
                    PrintWriter output = new PrintWriter(file);
                    )
            {
                while (!fileInputList.isEmpty()) {
                    output.println(fileInputList.remove(0));
                }
            }
        }
    }

    private static void findDirectorys(ArrayList<String> list) {
        String s = "projelerim/Exercise_12_0*/Exercise_12_0*.java";
        for (int i = 1; i <= 7; i++) {
            list.add(s.replaceAll("[*]", i + ""));
        }
    }
}
