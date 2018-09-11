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
            StringBuilder s = new StringBuilder(files[i].getName());
            if (s.toString().matches("Exercise.*_\\d{1}")) {
                s.insert(s.length() - 1, 0);
                files[i].renameTo(new File("files/" + s));
            }
        }
    }
}
