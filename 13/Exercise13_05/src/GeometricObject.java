public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;

    protected GeometricObject() {
        this("Yellow", true);
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "color: " + getColor() +
                "\nFilled: " + isFilled();
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() < o.getArea()) {
            return -1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else {
            return 1;
        }
    }
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) < 0) {
            return o2;
        }else
            return o1;
    }
}
