import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String hexString = input.next();
        hex2Dec(hexString);
    }

    public static void hex2Dec(String hexString) {
        int decimal = 0;
        hexString = hexString.toLowerCase();
        for (int i = 0; i < hexString.length(); i++) {
            if (Character.isDigit(hexString.charAt(i))) {
                decimal += Integer.parseInt(hexString.charAt(i) + "") * Math.pow(16, hexString.length() - i - 1);
            } else if (hexString.charAt(i) <= 'f' && hexString.charAt(i) >= 'a') {
                decimal += (10 + hexString.charAt(i) - 'a') * Math.pow(16,  hexString.length() - i - 1);
            } else
                throw new NumberFormatException("String is not a hex string");
        }
        System.out.println(decimal);
    }
}
