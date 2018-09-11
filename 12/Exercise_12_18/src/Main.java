import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list = new ArrayList<>();
        setArray(list);
        try {
            insertStatement(list);
            System.out.println("Process completed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void insertStatement(ArrayList<String> list) throws FileNotFoundException {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            File file = new File(list.get(i));
            if (!file.exists()) {
                System.out.println("File not exist: " + file);
                continue;
            }
            try (
                 Scanner input = new Scanner(file);
                    )
            {
                while (input.hasNext()) {
                    arrayList.add(input.nextLine());
                }
            }

            try (
                    PrintWriter output = new PrintWriter(file);
            )
            {
                output.println("package chapter" + i + ";");
                for (int j = 0; i < arrayList.size(); j++) {
                    output.println(arrayList.remove(0));
                }
            }
            arrayList.clear();
        }
    }

    private static void setArray(ArrayList<String> list) {
        StringBuilder stringBuilder = new StringBuilder("projelerim/Exercise_12_0*/Exercise_12_0*.java");
        int index1 = stringBuilder.indexOf("*");
        int index2 = stringBuilder.indexOf("*", index1 + 1);
        for (int i = 1; i <= 7; i++) {
            stringBuilder.replace(index1, index1 + 1, i + "");
            stringBuilder.replace(index2, index2 + 1, i + "");
            list.add(stringBuilder.toString());
        }
    }
}
