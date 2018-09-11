public class Main {

    public static void main(String[] args) {
	// write your code here
        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(1);
        objects[1] = new Circle(2);
        objects[2] = new Rectangle(2, 2);
        objects[3] = new Rectangle(4, 3);

        double sumArea = sumArea(objects);
        System.out.println(sumArea);

    }

    private static double sumArea(GeometricObject[] objects) {
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getArea();
        }
        return sum;
    }
}
