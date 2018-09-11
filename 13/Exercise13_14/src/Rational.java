public class Rational extends Number implements Comparable<Rational> {
    private long[] r = new long[2];

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long deminator) {
        long gcd = gcd(numerator, deminator);
        r[0] = numerator * deminator / Math.abs(deminator) / gcd;
        r[1] = Math.abs(deminator) / gcd;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDeminator() {
        return r[1];
    }

    public Rational add(Rational secondRational) {
        long n = getNumerator() * secondRational.getDeminator() +
                secondRational.getNumerator() * getDeminator();
        long d = getDeminator() * secondRational.getDeminator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = getNumerator() * secondRational.getDeminator() -
                secondRational.getNumerator() * getDeminator();
        long d = getDeminator() * secondRational.getDeminator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = getNumerator() * secondRational.getNumerator();
        long d = getDeminator() * secondRational.getDeminator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = getNumerator() * secondRational.getDeminator();
        long d = getDeminator() * secondRational.getNumerator();
        return new Rational(n, d);
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
        return getNumerator() * 1.0 / getDeminator();
    }

    @Override
    public String toString() {
        return getDeminator() == 1 ? getNumerator() + "": getNumerator() + "/"
                + getDeminator();
    }

    private static long gcd(long n, long d) {
        long gcd = 1;
        n = Math.abs(n);
        d = Math.abs(d);
        for (int i = 1; i <= ((n < d) ? n : d); i++) {
            if (n % i == 0 && d % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    @Override
    public int compareTo(Rational o) {
        if (doubleValue() < o.doubleValue())
            return -1;
        else if (doubleValue() == o.doubleValue())
            return 0;
        else
            return 1;
    }
}
