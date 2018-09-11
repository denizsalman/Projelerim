public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = new Octagon(2);

        Octagon octagon3 = (Octagon) octagon1.clone();

        System.out.println(octagon1.compareTo(octagon3));
    }
}
