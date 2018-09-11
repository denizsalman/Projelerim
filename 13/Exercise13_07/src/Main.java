public class Main {

    public static void main(String[] args) {
	// write your code here
        GeometricObject square = new Square(2);
        if (square instanceof Colorable)
            ((Square)square).howToColor();
    }
}
