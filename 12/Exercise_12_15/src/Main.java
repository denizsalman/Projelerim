import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File file = new File("Exercise12_15.txt");
        int[] numbers = new int[100];
        try (
            PrintWriter output = new PrintWriter(file);
        )
        {
            fillFile(output);
        }

        try (
                Scanner input = new Scanner(file);
                )
        {
            int count = 0;
            while (input.hasNext()) {
                numbers[count] = Integer.parseInt(input.next());
                count++;
            }
        }

        sortArray(numbers);
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void sortArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                if (min > numbers[j]) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
    }

    public static void fillFile(PrintWriter output) {
        for (int i = 0; i < 100; i++) {
            output.print((int)(Math.random() * 100) + " ");
        }
    }
}
