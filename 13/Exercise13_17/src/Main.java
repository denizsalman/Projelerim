import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex complex1 = new Complex(a, b);
        System.out.print("Enter the second complex number: ");
        a = input.nextDouble();
        b = input.nextDouble();
        Complex complex2 = new Complex(a, b);
        System.out.println("(" + complex1 + ") + (" + complex2 + ") = " +
                complex1.add(complex2));
        System.out.println("(" + complex1 + ") - (" + complex2 + ") = " +
                complex1.subtract(complex2));
        System.out.println("(" + complex1 + ") * (" + complex2 + ") = " +
                complex1.multiply(complex2));
        System.out.println("(" + complex1 + ") / (" + complex2 + ") = " +
                complex1.divide(complex2));

        System.out.println("|(" + complex1 + ")| = " + complex1.abs());

    }
}
