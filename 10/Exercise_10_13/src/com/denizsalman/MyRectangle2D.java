package com.denizsalman;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean contains(double x, double y) {
        return Math.abs(this.x - x) < width / 2 && Math.abs(this.y - y) < y / 2;
    }

    public boolean contains(MyRectangle2D r) {
        boolean isWidth = Math.abs(getX() - r.getX()) + r.getWidth() / 2 < getWidth() / 2;
        boolean isHeight = Math.abs(getY() - r.getY()) + r.getHeight() / 2 < getHeight() / 2;
        return isHeight && isWidth;
    }

    public boolean overlaps(MyRectangle2D r) {
        boolean isWidth = Math.abs(getX() - r.getX()) + r.getWidth() / 2 >= getWidth() / 2;
        boolean isHeight = Math.abs(getY() - r.getY()) + r.getHeight() / 2 >= getHeight() / 2;
        return !contains(r) && (isHeight || isWidth);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
