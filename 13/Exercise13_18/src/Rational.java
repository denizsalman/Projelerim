import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger[] r = new BigInteger[2];

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long deminator) {
        BigInteger n = BigInteger.valueOf(numerator);
        BigInteger d = BigInteger.valueOf(deminator);
        BigInteger gcd = gcd(n, d);
        r[0] = n.multiply(d).divide(d.abs()).divide(gcd);
        r[1] = d.abs().divide(gcd);
    }

    public BigInteger getNumerator() {
        return r[0];
    }

    public BigInteger getDeminator() {
        return r[1];
    }

    public Rational add(Rational secondRational) {
        BigInteger n = getNumerator().multiply(secondRational.getDeminator()).add(
                secondRational.getNumerator().multiply(getDeminator()));
        BigInteger d = getDeminator().multiply(secondRational.getDeminator());
        return new Rational(n.longValue(), d.longValue());
    }

    public Rational subtract(Rational secondRational) {
        BigInteger n = getNumerator().multiply(secondRational.getDeminator()).subtract(
                secondRational.getNumerator().multiply(getDeminator()));
        BigInteger d = getDeminator().multiply(secondRational.getDeminator());
        return new Rational(n.longValue(), d.longValue());
    }

    public Rational multiply(Rational secondRational) {
        BigInteger n = getNumerator().multiply(secondRational.getNumerator());
        BigInteger d = getDeminator().multiply(secondRational.getDeminator());
        return new Rational(n.longValue(), d.longValue());
    }

    public Rational divide(Rational secondRational) {
        BigInteger n = getNumerator().multiply(secondRational.getDeminator());
        BigInteger d = getDeminator().multiply(secondRational.getNumerator());
        return new Rational(n.longValue(), d.longValue());
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
        return getNumerator().divide(getDeminator()).doubleValue();
    }

    @Override
    public String toString() {
        return getDeminator().compareTo(BigInteger.ONE) == 0 ? getNumerator() + "": getNumerator() + "/"
                + getDeminator();
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger gcd = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE;
             i.compareTo((n.abs().compareTo(d.abs()) < 0 ? n.abs(): d.abs())) != 1;
             i = i.add(BigInteger.ONE)) {
            if (n.remainder(i).compareTo(BigInteger.ZERO) == 0 &&
                    d.remainder(i).compareTo(BigInteger.ZERO) == 0) {
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
