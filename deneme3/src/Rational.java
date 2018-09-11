public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                + secondRational.getNumerator() * denominator;
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                - secondRational.getNumerator() * denominator;
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        return denominator == 1 ? numerator + "" :
                numerator + "/" + denominator;
    }

    private long gcd(long n, long d) {
        n = Math.abs(n);
        d = Math.abs(d);
        long gcd = 1;
        for (int i = 1; i <= (n > d ? d : n); i++) {
            if (n % i == 0 && d % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public int compareTo(Rational o) {
        if (subtract(o).getNumerator() > 0) {
            return 1;
        } else if (subtract(o).getNumerator() == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
