package com.denizsalman;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(MyPoint myPoint) {
        return distance(myPoint.getX(), myPoint.getY());
    }

    public static boolean isIntersect(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
        double a = p1.getY() - p2.getY();
        double b = -(p1.getX() - p2.getX());
        double c = p3.getY() - p4.getY();
        double d = -(p3.getX() - p4.getX());
        if (a * d - b * c == 0) {
            return false;
        }
        return true;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
