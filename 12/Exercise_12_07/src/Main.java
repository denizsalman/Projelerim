import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = input.next();

        int decimal = bin2Decimal(binaryNumber);
        System.out.println(decimal);
    }

    private static int bin2Decimal(String binaryNumber) {
        int decimal = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {
                throw new NumberFormatException();
            }
            decimal += Integer.parseInt(binaryNumber.charAt(i) + "") *
                    Math.pow(2, binaryNumber.length() - i - 1);
        }
        return decimal;
    }
}
