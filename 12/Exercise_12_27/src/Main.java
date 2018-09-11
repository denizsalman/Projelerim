import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("files");
        System.out.println(file.isDirectory());
        File[] files = file.listFiles();

        try {
            replaceWords(files);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void replaceWords(File[] files) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            try (
            Scanner input = new Scanner(files[i]);
            )
            {
                while (input.hasNext()) {
                    String s = input.nextLine();
                    if (s.contains("Exercise")) {
                        list.add(pad(s));
                    } else {
                        list.add(s);
                    }
                }


                    try (
                            PrintWriter output = new PrintWriter(files[i]);
                            )
                    {
                        while (!list.isEmpty()) {
                        output.println(list.remove(0));
                    }
                }
                list.clear();
            }

        }
    }

    private static String pad(String s) {
        String[] words = s.split(" ");
        String replaced = "";
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            if (stringBuilder.toString().matches("Exercise\\d{1}_\\d{1}")) {
                stringBuilder.insert(8, 0);
                stringBuilder.insert(stringBuilder.length() - 1, 0);
                replaced += stringBuilder + " ";
            } else if (stringBuilder.toString().matches("Exercise\\d{1}_\\d{2}")){
                stringBuilder.insert(8, 0);
                replaced += stringBuilder + " ";
            } else if (stringBuilder.toString().matches("Exercise\\d{2}_\\d{1}")) {
                stringBuilder.insert(stringBuilder.length() - 1, 0);
                replaced += stringBuilder + " ";
            } else {
                replaced += stringBuilder + " ";
            }
        }
        return replaced;
    }

}
