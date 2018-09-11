import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        try {
            System.out.print("Enter the index: ");
            int index = input.nextInt();
            System.out.println("Element: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }

    }
}
