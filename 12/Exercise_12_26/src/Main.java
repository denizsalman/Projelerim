import java.io.File;
import java.nio.file.FileAlreadyExistsException;

public class Main {

    public static void main(String[] args) throws FileAlreadyExistsException {
	// write your code here
        if (args.length != 1) {
            System.out.println("Usage: java Main directoryName");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (file.exists()) {
            throw new FileAlreadyExistsException("Directory Already Exist");
        }
        file.mkdirs();
        System.out.println("Directory created successfully");
    }
}