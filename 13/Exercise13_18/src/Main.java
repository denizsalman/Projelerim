public class Main {

    public static void main(String[] args) {
	// write your code here
        Rational rational = new Rational();
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            rational = rational.add(new Rational(i, i + 1));
        }
        System.out.println(rational);
    }
}
