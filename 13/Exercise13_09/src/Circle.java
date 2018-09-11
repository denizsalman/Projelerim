public class Circle extends GeometricObject
implements Comparable<Circle>{
    private double radius;

    public Circle(){
       this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle o) {
        if (getArea() < o.getArea())
            return -1;
        else if (getArea() == o.getArea())
            return 0;
        else
            return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle)
            if (getArea() == ((Circle)obj).getArea())
                return true;
        return false;
    }
}
