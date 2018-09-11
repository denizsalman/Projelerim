public class Main {

    public static void main(String[] args) {
	// write your code here
        if (args.length != 1) {
            System.out.println("Usage: java Main \"3/4 + 1/5\"");
            System.exit(0);
        }
        String[] tokens = args[0].split("[/, ,]");
        long n = Long.parseLong(tokens[0]);
        long d = Long.parseLong(tokens[1]);
        Rational rational1 = new Rational(n, d);
        n = Long.parseLong(tokens[3]);
        d = Long.parseLong(tokens[4]);
        Rational rational2 = new Rational(n, d);
        switch (tokens[2]) {
            case "+":
                System.out.println(rational1.add(rational2));break;
            case "-":
                System.out.println(rational1.subtract(rational2));break;
            case "*":
                System.out.println(rational1.multiply(rational2));break;
            case "/":
                System.out.println(rational1.divide(rational2));break;
            default:
                System.out.println("Operator error");
        }

    }
}
