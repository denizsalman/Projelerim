public class Circle {
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Circle called");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle area: " + getArea();
    }
}
