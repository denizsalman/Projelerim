public class Main {

    public static void main(String[] args) {
	// write your code here
        ComparableCircle circle1 = new ComparableCircle(2);
        ComparableCircle circle2 = new ComparableCircle(4);

        if (circle1.getArea() < circle2.getArea()) {
            System.out.println(circle2);
        } else
            System.out.println(circle2);
    }
}
