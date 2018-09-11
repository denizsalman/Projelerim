public class ComparableCircle extends Circle
implements Comparable<ComparableCircle>{

    public ComparableCircle() {
        this(1);
    }

    public ComparableCircle(double radius) {
        super(radius);
        System.out.println("comparable circle called");
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getArea() < o.getArea())
            return -1;
        else if (getArea() == o.getArea())
            return 0;
        else
            return 1;
    }
}
