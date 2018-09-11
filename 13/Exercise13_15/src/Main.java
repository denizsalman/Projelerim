import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rational rational1 = new Rational(BigInteger.valueOf(Long.MAX_VALUE),
                BigInteger.valueOf(3));
        Rational rational2 = new Rational(BigInteger.valueOf(Long.MAX_VALUE),
                BigInteger.valueOf(3));

        System.out.println(rational1.multiply(rational2));
    }
}
