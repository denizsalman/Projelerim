package com.denizsalman;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        double side1 = p1.distance(p2);
        double side2 = p1.distance(p3);
        double side3 = p2.distance(p3);
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public boolean contains(MyPoint p) {
        return !(MyPoint.isIntersect(p, p1, p2, p3) || MyPoint.isIntersect(p, p2, p1, p3)
                || MyPoint.isIntersect(p, p3, p1, p2));
    }

    public boolean contains(Triangle2D t) {
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    public boolean overlaps(Triangle2D t) {
        return !contains(t);
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}
