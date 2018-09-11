import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;

public class Main {

    public static void main(String[] args) throws FileAlreadyExistsException, FileNotFoundException {
	// write your code here
        File file = new File("Salary.txt");
        String[] ranks = {"assistan", "associate", "full"};
        if (file.exists()) {
            throw new FileAlreadyExistsException("");
        }
        try (
                PrintWriter output = new PrintWriter(file);
                )
        {
            for (int i = 1; i <= 1000; i++) {
                int randomIndex = (int) (Math.random() * ranks.length);
                double salary;
                if (ranks[randomIndex].equals("assistan")) {
                    salary = 50000 + Math.random() * 30000;
                } else if (ranks[randomIndex].equals("associate")) {
                    salary = 60_000 + Math.random() * 50_000;
                } else {
                    salary = 75_000 + Math.random() * 55_000;
                }
                output.printf("First Name%d Last Name%d %s %.2f\n",i, i, ranks[randomIndex], salary);
            }
            System.out.println("Mission complated!");
        }
    }
}
