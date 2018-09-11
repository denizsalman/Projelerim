import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String decimalNumber = input.next();

        String[] tokens = decimalNumber.split("[.]");
        Rational r1 =  new Rational(Long.parseLong(tokens[0]), 1);
        Rational r2 = new Rational(Long.parseLong(tokens[1]), (long) Math.pow(10, tokens[1].length()));

        System.out.println(decimalNumber.charAt(0) == '-' ? r1.subtract(r2) : r1.add(r2));
    }
}
