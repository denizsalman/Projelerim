import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        boolean correctInput = false;
        do {
            try {
                System.out.print("Enter two integer: ");
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(a + " + " + b + " = " + (a + b));
                correctInput = true;

            } catch (InputMismatchException ex) {
                ex.printStackTrace();
                input.next();

            }
        } while (!correctInput);

    }
}
