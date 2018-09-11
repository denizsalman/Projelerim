import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File directory = new File("files");
        File[] files = directory.listFiles();
        renameFiles(files);

    }

    private static void renameFiles(File[] files) {
        for (int i = 0; i < files.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(files[i].getName());
            if (stringBuilder.toString().matches(".*Exercise\\d{1}_.*")) {
                stringBuilder.insert(8, 0);
                System.out.println(stringBuilder);
                File file = new File("files/" + stringBuilder.toString());
                files[i].renameTo(file);
            }
        }
    }
}
