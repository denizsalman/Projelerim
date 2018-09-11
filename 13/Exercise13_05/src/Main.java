public class Main {

    public static void main(String[] args) {
	// write your code here

        Rectangle rectangle = new Rectangle(1,2);
        System.out.println(rectangle.getArea());
        Rectangle rectangle2 = new Rectangle(2, 2);
        System.out.println(rectangle2.getArea());
        Circle circle = new Circle(0.2);
        System.out.println(GeometricObject.max(rectangle, circle));
    }
}
