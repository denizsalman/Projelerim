import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are: " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            System.out.println("The root is: " + (-b + Math.sqrt(discriminant)) / (2 * a));
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            Complex r1 = new Complex(realPart, imaginaryPart);
            imaginaryPart = -Math.sqrt(-discriminant) / (2 * a);
            Complex r2 = new Complex(realPart, imaginaryPart);
            System.out.println("The roots are: " + r1 + " and " + r2);
        }

    }

}
